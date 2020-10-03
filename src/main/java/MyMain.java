public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5

    public static byte rollDie(){
        return (byte) (Math.random()*6 + 1);
    }

    public static double probabilityOneSix() {
        double sixCount = 0.0;
        int n_trial = 10000;
        
        for(int k = 0; k < n_trial; k ++){
            for(int i = 0; i < 6; i ++){
                if(rollDie() == 6){
                    sixCount ++;
                    break;
                }
            }
        }

        return sixCount/100.0;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        double sixCount = 0.0;
        int n_trial = 10000;
        int n_six = 0;
        
        for(int k = 0; k < n_trial; k ++){
            n_six = 0;
            for(int i = 0; i < 12; i ++){
                if(rollDie() == 6){
                    n_six ++; 
                    if(n_six == 2){
                        sixCount ++;
                        break;
                    }
                }
            }
        }

        return sixCount/100.0;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
      double sixCount = 0.0;
        int n_trial = 10000;
        int n_six = 0;
        
        for(int k = 0; k < n_trial; k ++){
            n_six = 0;
            for(int i = 0; i < 18; i ++){
                if(rollDie() == 6){
                    n_six ++; 
                    if(n_six == 3){
                        sixCount ++;
                        break;
                    }
                }
            }
        }

        return sixCount/100.0;
    }

    public static double testSixes(int sixes, int rolls){
        double sixCount = 0.0;
        int n_trial = 10000;
        int n_six = 0;
        
        for(int k = 0; k < n_trial; k ++){
            n_six = 0;
            for(int i = 0; i < rolls; i ++){
                if(rollDie() == 6){
                    n_six ++; 
                    if(n_six == sixes){
                        sixCount ++;
                        break;
                    }
                }
            }
        }

        return sixCount/100.0;
    }

    public static void main(String[] args) {
        System.out.println(probabilityOneSix());        
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
        System.out.println(testSixes(4,24));

        for(int i = 1; i < 25; i ++){
            System.out.println(testSixes(i, 6*i));
        }
    }
}
