package main;

public class hh {
        private String name;
        private String number;

        public hh(String name, String num){
            this.name = name;
            setName(num);
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = "";
            boolean copy = true;
            if (!name.contains("-")){
                copy = false;
                this.name += name.substring(0,name.length()-4);
                this.name += "-"+(name.substring(name.length()-4));
            }
            if (name.length() < 12 && !name.contains("(")){
                copy = false;
                this.name += "("+ name.substring(0,3)+")";
                this.name += (name.substring(3));
            }
            if (copy)
                this.name = name;
        }
        public String getNum(){
            return number;
        }
        public void setNum(String num){
            this.number = num;
        }

        public String toString() {
            return name + ": "+ number;
        }
}
