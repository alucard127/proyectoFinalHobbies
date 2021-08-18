package com.company;

    public class Fitness extends Hobbies{
        String typeFitness;
        String nameGym;
        String typeExercisses;
        double numWeight;
        double numHeight;

        public Fitness(String typeFitness, String nameGym, String typeExercisses, double numWeight, double numHeight) {
            this.typeFitness = typeFitness;
            this.nameGym = nameGym;
            this.typeExercisses = typeExercisses;
            this.numWeight = numWeight;
            this.numHeight = numHeight;

        }

        public String getTypeFitness() {
            return typeFitness;
        }

        public String getNameGym() {
            return nameGym;
        }

        public String getTypeExercisses() {
            return typeExercisses;
        }

        public double getNumWeight() {
            return numWeight;
        }

        public double getNumHeight() {
            return numHeight;
        }

        public String displayData(){
            return "the name of gym is : "+ getNameGym()+ " the user will work : "+ getTypeFitness()+ " user works with : "
                    +getTypeExercisses()+ " the user has a height of : "+ getNumHeight()+ " the user has a weight of : "+ getNumWeight();

        }
    }

