class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];

        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;

        for (int i = 1; i < nums.length; i++) {
            int suma = 0;
            for (int j = 0; j < i; j++) {
                suma = suma + nums[j];
            }
            leftSum[i] = suma;
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            int suma = 0;
            for (int j = nums.length - 1; j > i; j--) {
                suma = suma + nums[j];
            }
            rightSum[i] = suma;
        }

        // loop para calcular el absoluto de la resta de ambos arrays.
        for (int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        // devolvemos la respuesta.
        return answer;
    }
}