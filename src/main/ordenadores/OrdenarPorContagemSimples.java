package ordenadores;

public class OrdenarPorContagemSimples implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int[] count = new int[array.length];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
          }
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        int i = 0;
        for (int j = 0; j < count.length; j++) {
            for (int k = 0; k < count[j]; k++) {
                array[i++] = j;
    }
  }
        return array;
    }
    
}
