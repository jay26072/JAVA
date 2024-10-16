
class demo {

    int person;
    int fulecap;
}

class vehical {

    public static void main(String[] args) {
        demo obj1 = new demo();
        demo obj2 = new demo();

        obj1.person = 10;
        obj2.fulecap = 20;

        obj1 = obj2;

        System.out.println(obj1.fulecap);
    }
}
