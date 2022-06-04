package com.example.effectivejava.chapter02.item13.clone_use_constructor;

public class Item implements Cloneable {

    private String name;

    /**
     * 이렇게 구현하면 하위 클래스의 clone()이 깨질 수 있다.
     * super.clone()을 호출하여야 함.
     * @Return
     */
    @Override
    public Item clone() {
        Item item = new Item();
        item.name = this.name;
        return item;
    }
}
