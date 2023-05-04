package array_tasks;
public class Array_tasks {
    public static void main(String[] args) {
        int mass[] = {1, -532, 15, -67, 517, -12, 89};
        int mass_clone[] = new int[mass.length];
        int i;
        int k;
        int num;
        int sum = 0;
        int counter = 0;
        int counter_n = 0;
        int counter_p = 0;
        double mediana;
        double med_1;
        double med_2;
            
            for(i = 0; i < mass.length; i++){
                mass_clone[i] = mass[i];
                
            }
            System.out.println("1. Массив mass[] состоит из " + mass.length + " объектов.");
            System.out.println("2. Массив mass[] включает в себя следующие объекты:");
            System.out.print("\t");
            for(i = 0; i < mass.length; i++){
                System.out.print(mass[i] + " ");
        }
            System.out.println();
            System.out.println("3. После сортировки объектов от меньшего к большему порядок следующий: ");
            System.out.print("\t");
                for(i = 0; i < mass.length; i++){
                    for(k = mass.length-2; k >= 0; k--){
                        if(mass[k] > mass[k+1]){
                            num = mass[k];
                            mass[k] = mass[k+1];
                            mass[k+1] = num;
                    }   
                }
            System.out.print(mass[i] + " ");
        }
            System.out.println();
            System.out.print("4. Сумма объектов массива mass[] равняется: ");
                for(i = 0; i < mass.length; i ++){
                sum = sum + mass[i];
                }
            System.out.println(sum);
            System.out.println("5. Наибольшее число в этом массиве: " + mass[mass.length-1]);
            System.out.println("6. Наименьшее число в этом массиве: " + mass[0]);
            System.out.println("7. Отрицательные числа в массиве mass[]: ");
            System.out.print("\t");
                for(i = 0; i < mass.length; i++){
                    if(mass[i] >= 0) continue;
                    System.out.print(mass[i] + " ");
                    counter_n++;
                }
            System.out.println();
            System.out.println("8. Количество отрицательных чисел в массиве mass[]: " + counter_n);
            System.out.println("9. Положительные числа в массиве mass[]: ");
            System.out.print("\t");
                for(i = 0; i < mass.length; i++){
                    if(mass[i] < 0) continue;
                    System.out.print(mass[i] + " ");
                    counter_p++;
                }
            System.out.println();
            System.out.println("10. Количество положительных чисел в массиве mass[]: " + counter_p);
            System.out.print("11. Медианой массива mass[] является: ");
                if(mass.length%2 == 0) {
                    med_1 = mass[mass.length/2-1];
                    med_2 = mass[mass.length/2];
                    mediana = (med_1 + med_2) / 2;
                    System.out.print(mediana);
                } else {
                    System.out.print(mass[mass.length/2]);
                  }
            System.out.println();
            
            System.out.print("12. Индекс первого вхождения элемента, содержащего в себе число '517', будет: ");
            for(i = 0; i < mass_clone.length; i++){
                if(mass_clone[i] != 517){
                    counter++;
                } else
                    System.out.println(counter);
            }
            
    }
    
}
