class DiceRoll {

    public void roll(){
        int numberBetween1to6 = (int) (Math.floor(Math.random() * 6) + 1);
        System.out.println("Dice number is: "+ numberBetween1to6);
    }
    public static void main(String[] args) {
        System.out.println("Welcome in the world of Dice Roll.");
        DiceRoll dice = new DiceRoll();
        for (int i = 0; i < 20; i++) {
            dice.roll();
        }
    }
}
