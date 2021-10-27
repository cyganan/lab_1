package com.company;

import java.util.Scanner;

public class ConsoleUserDialog {
    private final String ERROR_MESSAGE = "Nieprawidłowe dane!\nSpróbuj jeszcze raz.";
    private final Scanner sc;

    public ConsoleUserDialog() {
        this.sc = new Scanner(System.in);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printInfoMessage(String message) {
        System.out.println(message);
        this.enterString("Nacisnij ENTER");
    }

    public void printErrorMessage(String message) {
        System.err.println(message);
        System.err.println("Nacisnij ENTER");
        this.enterString("");
    }

    public void clearConsole() {
        System.out.println("\n\n");
    }

    public String enterString(String prompt) {
        System.out.print(prompt);
        return this.sc.nextLine();
    }

    public char enterChar(String prompt) {
        char c = ' ';

        boolean isError;
        do {
            isError = false;

            try {
                c = this.enterString(prompt).charAt(0);
            } catch (IndexOutOfBoundsException var5) {
                System.err.println("Nieprawidłowe dane!\nSpróbuj jeszcze raz.");
                isError = true;
            }
        } while (isError);

        return c;
    }

    public int enterInt(String prompt) {
        int i = 0;

        boolean isError;
        do {
            isError = false;

            try {
                i = Integer.parseInt(this.enterString(prompt));
            } catch (NumberFormatException var5) {
                System.err.println("Nieprawidłowe dane!\nSpróbuj jeszcze raz.");
                isError = true;
            }
        } while (isError);

        return i;
    }

    public float enterFloat(String prompt) {
        float d = 0.0F;

        boolean isError;
        do {
            isError = false;

            try {
                d = Float.parseFloat(this.enterString(prompt));
            } catch (NumberFormatException var5) {
                System.err.println("Nieprawidłowe dane!\nSpróbuj jeszcze raz.");
                isError = true;
            }
        } while (isError);

        return d;
    }

    public double enterDouble(String prompt) {
        double d = 0.0D;

        boolean isError;
        do {
            isError = false;

            try {
                d = Double.parseDouble(this.enterString(prompt));
            } catch (NumberFormatException var6) {
                System.err.println("Nieprawidłowe dane!\nSpróbuj jeszcze raz.");
                isError = true;
            }
        } while (isError);

        return d;
    }
}
