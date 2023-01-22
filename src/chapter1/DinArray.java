package chapter1;

public class DinArray {
        private int[] array = new int[10];
        private int size = 0;

        //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
        //և ավելացնենք
        public void add(int value) {
          //  if(size> array.length-1){
              //      extend();}
            array[size++]=value;

        }

        //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
        //2․ քցել հին մասիվի էլեմենտները նորի մեջ
        //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
       /* private void extend() {
                int lenght= array.length+10;
                int[]newarray=new int[lenght];
                for(int i=0; i< array.length;i++){
                        newarray[i]=array[i];

        }
                array=newarray;
        }  */

        //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
        // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։

     /*  public int getByIndex(int index) {
                if(index>0 && index< array.length){
                       return array[index];
                }
                return -1;

        }    */

        //տպել մասիվի ավելացված էլեմենտները
        public void print() {
                for(int i=0;i< size;i++){
                        System.out.print(array[i]+" ");
                }
                System.out.println();
        }

    }


