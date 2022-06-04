package com.example.effectivejava.chapter02.item13.clone_use_constructor;

public class SubItem extends Item implements Cloneable {

    private String name;

    /**
     * 상위 타입을 하위 타입으로 형변환 할 수 없음.
     */
    @Override
    public SubItem clone() {
        return (SubItem) super.clone();
    }

    public static void main(String[] args) {
        SubItem item = new SubItem();
        SubItem clone = item.clone();
        System.out.println(clone != null);
        System.out.println(clone.getClass() == item.getClass());
        System.out.println(clone.equals(item));
    }

}
