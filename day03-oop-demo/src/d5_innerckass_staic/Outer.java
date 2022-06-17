package d5_innerckass_staic;

public class Outer {
    /*学习静态成员内部类*/
    public static class Inner{
        private String name;
        private int age;
        public static String schoolName;

        public Inner(){

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
