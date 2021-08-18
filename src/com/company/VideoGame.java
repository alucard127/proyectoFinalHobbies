package com.company;

public class VideoGame extends Hobbies{
   String nameGame;
   String typeGender;
   String descriptionGame;
   int levels;
   public VideoGame(String nameGame, String typeGender, String descriptionGame, int levels) {
      this.nameGame = nameGame;
      this.typeGender = typeGender;
      this.descriptionGame = descriptionGame;
      this.levels = levels;
   }

   public String getNameGame() {
      return nameGame;
   }

   public String getTypeGender() {
      return typeGender;
   }

   public String getDescriptionGame() {
      return descriptionGame;
   }

   public int getLevels() {
      return levels;
   }
   public String displayData(){
      return "the name of vodeoGame is : "+ getNameGame()+ " \n" +
              "the user chose the type of gender : "+ getTypeGender()+ " \n" +
              "the game is about: " +getDescriptionGame()+
              " \n"+" the user is at level number :  "+getLevels();


   }
}
