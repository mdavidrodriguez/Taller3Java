import java.util.Scanner;
public class Ejercicio9 {
  private float CostoT;
  private float MontoTotal = 0;
  private int Nproducto;
  private int CantidadVendida;  
    
    
    public void RecibeP(){  
  
        Scanner Hm = new Scanner(System.in); 
         
        System.out.print("\nEste almacen vende cinco productos con los siguientes precios: ");
        System.out.println("\nprecios:");
        System.out.println("\nProducto 1: $2.50");
        System.out.println("\nProducto 2: $4.80");
        System.out.println("\nProducto 3: $9.50");
        System.out.println("\nProducto 4: $4.20");
        System.out.println("\nProducto 5: $6.40\n");

        System.out.println("\nIntroduzca el numero del primer producto: ");
        System.out.println("( -1 para terminar).");
        Nproducto = Hm.nextInt(); 
        
         while ( -1 != Nproducto ){        
                                            // Abre while
   
            switch ( Nproducto ){
                                            // Abre switch

                    case 1: {

                        System.out.print("\nIntroduzca la cantidad vendida de este producto: ");
                        CantidadVendida = Hm.nextInt();
                        System.out.printf("\nPrecio de esta venta: %f", CantidadVendida*2.98);
                        MontoTotal += CantidadVendida*2.98;
                        break;
                        }  

                    case 2:{  

                        System.out.print("\nIntroduzca la cantidad vendida de este producto:");
                        CantidadVendida = Hm.nextInt();
                        System.out.printf("\nPrecio de esta venta: %f", CantidadVendida*4.50);
                        MontoTotal += CantidadVendida*4.50;
                        break;
                        }  

                    case 3:{    

                        System.out.print("\nIntroduzca la cantidad vendida de este producto: ");
                        CantidadVendida = Hm.nextInt();
                        System.out.printf("\nPrecio de esta venta: %f", CantidadVendida*9.98);
                        MontoTotal += CantidadVendida*9.98;
                        break;
                        }  

   
                    case 4:{ 

                        System.out.print("\nIntroduzca la cantidad vendida de este producto: ");
                        CantidadVendida = Hm.nextInt();
                        System.out.printf("\nPrecio de esta venta: %f", CantidadVendida*4.49);
                        MontoTotal += CantidadVendida*4.49;
                        break;
                        }  

                    case 5:{    

                        System.out.print("\nIntroduzca la cantidad vendida de este producto: ");
                        CantidadVendida = Hm.nextInt();
                        System.out.printf("\nPrecio de esta venta: %f", CantidadVendida*6.87);
                        MontoTotal += CantidadVendida*6.87;
                        break;
                        }  


                    default :{    
                        
                        System.out.print("\nINTRODUZCA NUMERO DE PRODUCTO VALIDO!");
                        break;
                        }  

                    }   // Cierra switch

                    System.out.println("\nPor favor introduzca el numero del siguiente producto: ");
                    System.out.println("( -1 para terminar).");
                    Nproducto = Hm.nextInt(); 


                }        // Cierra while

            System.out.printf("\nLas ventas totales fueron: %f\n\n", MontoTotal);
        }          // Cierra metodo RecibeP

  }        // Cierra clase Ejercicio_9