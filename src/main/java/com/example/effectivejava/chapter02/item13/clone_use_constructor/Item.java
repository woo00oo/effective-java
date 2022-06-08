package com.example.effectivejava.chapter02.item13.clone_use_constructor;

public class Item implements Cloneable {

    private String name;

    /**
     * 이렇게 구현하면 하위 클래스의 clone()이 깨질 수 있다.
     * super.clone()을 호출하여야 함.
     * @Return
     */
//    @Override
//    public Item clone() {
//        Item item = new Item(); 생성자로 clone을 구현하면 안됨.
//        item.name = this.name;
//        return item;
//    }

    @Override
    public Item clone() {
        try {
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
