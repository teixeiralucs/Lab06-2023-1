package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {


        return array;
    }
    

    public int quickParticio(int[] array, int inicio, int Fim){
        int pivot = array[Fim];
        int i = inicio - 1;
        for (int j = inicio; j < Fim; j++) {
            if (array[j] <= pivot) {
                i++;
                int reserva = array[i+1];
                array[i+1] = array[Fim];
                array[Fim] = reserva;
            }
        }
        int reserva = array[i +1];
        array[i +1] = array[Fim];
        array[Fim] = reserva;
        return i;
    }
}