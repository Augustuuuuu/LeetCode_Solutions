import java.util.HashMap;
class Solution_Better {
    public int[] twoSum(int[] nums, int target){
        // Mapa que vai guardar: número -> índice
        HashMap<Integer, Integer> mapa =  new HashMap<>();

        // Percorrer o array
        for(int i = 0; i < nums.length; i++){
            int numeroAtual = nums[i];
            int complemento = target - numeroAtual;

            // Verificar se o complemento já foi visto

            if(mapa.containsKey(complemento)){
                // Se sim, retorna o índice do complemento e o índice atual
                return new int[] { mapa.get(complemento), i};

            }
            // Se não, guarda o número atual e seu índice.

            mapa.put(numeroAtual, i);

        }
        return new int[] {};
    }

}