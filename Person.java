package com.hakerRank;

public class Person {
    private int age;

    //Constructor
    public Person(int initialAge) {
        if (initialAge >0){
            age = initialAge;
        } else{
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    //Instance methods
    public void yearPasses(){
        age++;
    }

    public void amIOld(){
        String answer;
        if(this.age >=13 && this.age <18){
            answer = "You are a teenager.";
        }else if(this.age <13){
            answer = "You are young.";
        }else{
            answer = "You are old.";
        }
        System.out.println(answer);
    }


}
