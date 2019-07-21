class RaindropConverter {

    String convert(int number) {
        String numberSound = "";
        if (number % 3 == 0) numberSound += "Pling";
        if (number % 5 == 0) numberSound += "Plang";
        if (number % 7 == 0) numberSound += "Plong";
        if (numberSound.equals("")) numberSound = String.valueOf(number);
        return numberSound;
    }

}
