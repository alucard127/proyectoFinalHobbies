package com.company;

public class Hobbies {

        private String nameHobbies;

        public Hobbies(){

        }

        public Hobbies(String nameHobbies) {
            this.nameHobbies = nameHobbies;
        }

        public String getNameHobbies() {
            return nameHobbies;
        }

        public String displayData(){
            return "the hobbie is: "+getNameHobbies();

        }


    }



