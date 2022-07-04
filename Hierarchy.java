class A {
    public void A() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void B() {
        System.out.println("Class B");
    }
}

class C extends B {
    public void C() {
        System.out.println("Class C");
    }
}

class D extends C {
    public void D() {
        System.out.println("Class D");
    }
}

class E extends D {
    public void E() {
        System.out.println("Class E");
    }
}

class F extends E {
    public void F() {
        System.out.println("Class F");
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        F f = new F();
        b.A();
        b.B();
        c.A();
        c.B();
        c.C();
        f.A();
        f.B();
        f.C();
        f.D();
        f.E();
        f.F();
    }
}
