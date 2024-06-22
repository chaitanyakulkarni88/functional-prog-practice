package progs;

public enum EnumSingleton {

    INST;

    public static void main(String[] args) {
        EnumSingleton.INST.doSomething();
    }

    private void doSomething() {
        System.out.println("Hello Singleton");
        for(EnumSingleton es:EnumSingleton.values())
        {
            System.out.println(es);
        }
    }
}
