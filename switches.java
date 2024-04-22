public class switches {
    public static void main(String[] args) {
        int a=1;
//        if (a==1){
//            System.out.println("one");
//        }
//        else if
//            (a==2){
//                System.out.println("two");
//            }
//        else {
//            System.out.println("other numbers");
//        }

        switch (a){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("other numbers");
                break;
        }

    }
}
