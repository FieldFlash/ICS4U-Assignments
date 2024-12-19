/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

class KnockKnockProtocol {
    private static final int WAITING = 0;
    private static final int SENTKNOCKKNOCK = 1;
    private static final int SENTCLUE = 2;
    private static final int ANOTHER = 3;

    private int state = WAITING;
    private int currentJoke = 0;

    private String[] clues = { "Turnip", "Lettuce", "Atch", "Who", "Who" };
    private String[] answers = { "Turnip the heat, it's cold in here!",
                                 "Lettuce in, it's freezing out here!",
                                 "Bless you!",
                                 "Is there an owl in here?",
                                 "Is there an echo in here?" };

    public String processInput(Object object) {
        String theInput = (String) object;
        String theOutput = null;

        switch (state) {
            case WAITING -> {
                theOutput = "Knock! Knock!";
                state = SENTKNOCKKNOCK;
            }
            case SENTKNOCKKNOCK -> {
                if (theInput.equalsIgnoreCase("Who's there?")) {
                    theOutput = clues[currentJoke];
                    state = SENTCLUE;
                } else {
                    theOutput = "You're supposed to say \"Who's there?\"! Try again. Knock! Knock!";
                }
            }
            case SENTCLUE -> {
                if (theInput.equalsIgnoreCase(clues[currentJoke] + " who?")) {
                    theOutput = answers[currentJoke] + " Want another? (y/n)";
                    state = ANOTHER;
                } else {
                    theOutput = "You're supposed to say \"" + clues[currentJoke] + " who?\"! Try again. Knock! Knock!";
                    state = SENTKNOCKKNOCK;
                }
            }
            case ANOTHER -> {
                if (theInput.equalsIgnoreCase("y")) {
                    theOutput = "Knock! Knock!";
                    if (currentJoke == (clues.length - 1))
                        currentJoke = 0;
                    else
                        currentJoke++;
                    state = SENTKNOCKKNOCK;
                } else {
                    theOutput = "Bye.";
                    state = WAITING;
                }
            }
            default -> {
            }
        }
        return theOutput;
    }
}
