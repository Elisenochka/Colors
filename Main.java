import java.lang.reflect.Constructor;

/**
 * Created by Mega-Raid-2 on 18.04.2017.
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        String Colors[] = {"Red","Orange","Yellow","Green","Blue","Indigo","Violet"};
        for (String clr: Colors){
            Class<?> c = Class.forName("Main$"+clr);
            //Constructor<?> ctr = c.getConstructor();
            Object color = c.newInstance();//напишите тут ваш код
        }
    }


    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}


