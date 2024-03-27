public class RewardValue {

        private double cashValue;
        private int milesValue;

        // Constructor accepting cash value
        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            // Convert cash value to miles
            this.milesValue = (int) (cashValue / 0.0035);
        }

        // Constructor accepting miles value
        public RewardValue(int milesValue) {
            this.milesValue = milesValue;
            // Convert miles to cash value
            this.cashValue = milesValue * 0.0035;
        }

        // Method to get cash value
        public double getCashValue() {
            return cashValue;
        }

        // Method to get miles value
        public int getMilesValue() {
            return milesValue;
        }
    }



