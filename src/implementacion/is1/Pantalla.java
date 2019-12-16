/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion.is1;

import java.util.*;
import java.util.Scanner;

public class Pantalla {
    
    public Controlador ctrl;
    public Pantalla(){
        ctrl = new Controlador();
    }
    
    public void menuPrincipal(){
        Scanner s = new Scanner(System.in);
        int i = -1;
        while (i != 0){
            System.out.println("-------------------------------------------------------\n"
                             + "Aplicación de Control de Comidas\n"
                             + "-------------------------------------------------------\n"
                             + "Menú Principal:\n"
                             + "1. Gestionar Recetas\n"
                             + "2. Gestionar Grupo de Alimentos\n"
                             + "3. Gestionar Comidas\n\n"
                             + "0. Salir\n\n"
                             + "Introduzca la operación que desea realizar:");
            i = Integer.parseInt(s.nextLine());
            switch (i) {
                case 1: 
                    menuGestionRecetas();
                    break;
                case 2:
                    menuGestionGrupos();
                    break;
                case 3:
                    menuGestionComidas(); 
                    break;
                default:
                    break;
            }
        }     
    }
    
    public void menuGestionRecetas(){
        Scanner s = new Scanner(System.in);
        int i = -1;
        while (i != 0){
            System.out.println("\n-------------------------------------------------------\n"
                             + "Aplicación de Control de Comidas\n"
                             + "-------------------------------------------------------\n"
                             + "Menú de Gestión de Recetas:\n"
                             + "1. Registrar Receta\n"
                             + "2. Consultar Receta\n\n"
                             + "0. Salir\n\n"
                             + "Introduzca la operación que desea realizar:");
            i = Integer.parseInt(s.nextLine());
            switch (i) {
                case 1: //Registrar Receta1
                    ctrl.crearReceta();
                    System.out.println("\nIntroduzca el nombre de la Receta:");
                    String nom = (String)s.nextLine();
                    System.out.println("Introduzca las intrucciones de la Receta:");
                    String inst = (String)s.nextLine();
                    ctrl.inNomInstReceta(nom, inst);
                    System.out.println("Introduzca el nombre del primer ingrediente:");
                    String nomAlimento = (String)s.nextLine();
                    
                    if(ctrl.registro.getAlimento(nomAlimento)!=null){
                        System.out.println("Introduzca la cantidad:");
                        float cantidad = s.nextFloat();
                        System.out.println("Introduzca la unidad de medida:");
                        String uMedida = (String)s.nextLine();
                        ctrl.añadirAlimentoReceta(nomAlimento, uMedida, cantidad);
                    }
                    else{
                        System.out.println("\nEl ingrediente no existe en el Sistema\n");
                    }
                            
                    int j = -1;
                    while (j != 0){
                        System.out.println("\n¿Desea agregar más ingredientes?\n"
                                         + "1. Seguir agregando\n"
                                         + "0. Salir\n");
                        j = Integer.parseInt(s.nextLine());
                        if (j == 1){
                            System.out.println("Introduzca el nombre del ingrediente:");
                            nomAlimento = s.nextLine();
                            if(ctrl.registro.getAlimento(nomAlimento)!=null){
                                System.out.println("Introduzca la cantidad:");
                                int cantidad = Integer.parseInt(s.nextLine());
                                System.out.println("Introduzca la unidad de medida:");
                                String uMedida = s.nextLine();
                                ctrl.añadirAlimentoReceta(nomAlimento, uMedida, cantidad);
                            }
                            else{
                                System.out.println("\nEl ingrediente no existe en el Sistema\n");
                            }
                        }
                    }
                    if (!ctrl.confirmarReceta()){
                        System.out.println("\nYa existe una Receta con ese nombre en el Sistema\n");
                    }
                    break;
                case 2: //Consultar Receta
                    int k=-1;
                    
                    while(k!=0){
                        if(k==-1){
                            k++;
                            System.out.println("\nIntroduzca el nombre de la Receta:");
                            String nomReceta = s.nextLine();
                            System.out.println(ctrl.inNomReceta(nomReceta));
                            System.out.println("\nPara salir pulse 0: ");
                            k=Integer.parseInt(s.nextLine());
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
    
    public void menuGestionGrupos(){
        Scanner s = new Scanner(System.in);
        int i = -1;
        while (i != 0){
            System.out.println("\n-------------------------------------------------------\n"
                             + "Aplicación de Control de Comidas\n"
                             + "-------------------------------------------------------\n"
                             + "Menú de Gestión de Grupos de Alimentos:\n"
                             + "1. Crear Grupo de Alimentos\n"
                             + "2. Eliminar Grupo de Alimentos\n"
                             + "3. Añadir Alimentos a un Grupo\n"
                             + "4. Eliminar Alimentos de un Grupo\n"
                             + "5. Consultar Grupo de Alimentos\n\n"
                             + "0. Salir\n\n"
                             + "Introduzca la operación que desea realizar:");
            i = Integer.parseInt(s.nextLine());
            switch (i) {
                case 1: //Crear Grupo de Alimentos
                    ctrl.añadirGrupoAlimentos();
                    System.out.println("\nIntroduzca el nombre del Grupo de Alimentos:");
                    String nom = s.nextLine();
                    System.out.println("Introduzca la Descripción:");
                    String descripcion = s.nextLine();
                    ctrl.inNomDescGA(nom, descripcion);
                    System.out.println("\nIntroduzca el nombre del Alimento:");
                    String nomAlimento = s.nextLine();
                    if(!ctrl.añadirAlimento(nomAlimento)){
                        System.out.println("\nEl Alimento no existe en el Sistema\n");
                    }
                    int j = -1;
                    while (j != 0){
                        System.out.println("\n¿Desea agregar más Alimentos?\n"
                                         + "1. Seguir agregando\n"
                                         + "0. Salir\n");
                        j = Integer.parseInt(s.nextLine());
                        if (j == 1){
                            System.out.println("\nIntroduzca el nombre del Alimento:");
                            nomAlimento = s.nextLine();
                            if(!ctrl.añadirAlimento(nomAlimento)){
                                System.out.println("\nEl Alimento no existe en el Sistema\n");
                            }
                        }
                    }
                    if (!ctrl.confirmarGrupo()){
                        System.out.println("\nYa existe un Grupo de Alimentos con ese nombre en el Sistema\n");
                    }
                    break;
                case 2: //Eliminar Grupo de Alimentos
                    System.out.println("\nIntroduzca el nombre del Grupo de Alimentos:");
                    String nomGrupo = s.nextLine();
                    System.out.println(ctrl.inNomGA(nomGrupo));
                    if (ctrl.getGa() != null){
                        j = -1;
                        if(j == 1){
                            System.out.println("\n¿Desea eliminar este Grupo de Alimentos?\n"
                                             + "1. Eliminar\n"
                                             + "0. Cancelar\n");
                            j = Integer.parseInt(s.nextLine());
                            if (j == 1){
                                ctrl.confirmarBorradoGA();
                            }
                        } 
                    }
                    break;
                case 3: //Añadir Alimentos a un Grupo
                    System.out.println("\nIntroduzca el nombre del Grupo de Alimentos:");
                    nomGrupo = s.nextLine();
                    System.out.println(ctrl.inNomGA(nomGrupo));
                    if (ctrl.getGa() != null){
                        System.out.println("\nIntroduzca el nombre del Alimento:");
                        nomAlimento = s.nextLine();
                        if(!ctrl.añadirAlimento(nomAlimento)){
                            System.out.println("\nEl Alimento no existe en el Sistema\n");
                        }
                        j = -1;
                        while (j != 0){
                            System.out.println("\n¿Desea agregar más Alimentos?\n"
                                             + "1. Seguir agregando\n"
                                             + "0. Salir\n");
                            j = Integer.parseInt(s.nextLine());
                            if (i == 1){
                                System.out.println("\nIntroduzca el nombre del Alimento:");
                                nomAlimento = s.nextLine();
                                if(!ctrl.añadirAlimento(nomAlimento)){
                                    System.out.println("\nEl Alimento no existe en el Sistema\n");
                                }
                            }
                        }
                    }
                    break;
                case 4: //Eliminar Alimentos de un Grupo
                    System.out.println("\nIntroduzca el nombre del Grupo de Alimentos:");
                    nomGrupo = s.nextLine();
                    System.out.println(ctrl.inNomGA(nomGrupo));
                    if (ctrl.getGa() != null){
                        System.out.println("\nIntroduzca el nombre del Alimento que desea eliminar:");
                        nomAlimento = s.nextLine();
                        int p = -1;
                        if(ctrl.eliminarAlimentoGA(nomAlimento)!=null){
                            while (p != 0 && p != 1){
                                System.out.println("\n¿Desea eliminar este Alimento?\n"
                                                 + "1. Eliminar\n"
                                                 + "0. Cancelar\n");
                                p = Integer.parseInt(s.nextLine());
                                if (p == 1){
                                    ctrl.confirmarBorradoA();
                                }
                            }
                        }else{
                            System.out.println("El alimento no existe en el sistema");
                        }
                        j = -1;
                        while (j != 0){
                            System.out.println("\n¿Desea eliminar más Alimentos?\n"
                                             + "1. Seguir eliminando\n"
                                             + "0. Salir\n");
                            j = Integer.parseInt(s.nextLine());
                            if (j == 1){
                                System.out.println("\nIntroduzca el nombre del Alimento que desea eliminar:");
                                nomAlimento = s.nextLine();
                                
                                
                                if(ctrl.eliminarAlimentoGA(nomAlimento)!=null){
                                    p = -1;
                                    while (p != 0){
                                        System.out.println("\n¿Desea eliminar este Alimento?\n"
                                                         + "1. Eliminar\n"
                                                         + "0. Cancelar\n");
                                        p = Integer.parseInt(s.nextLine());
                                        if (p == 1){
                                            ctrl.confirmarBorradoA();
                                        }
                                    }
                                }
                                else{
                                    System.out.println("El alimento no existe en el sistema");
                                }
                            }
                        } 
                    }
                    break;
                case 5: //Consultar Grupo de Alimentos
                    int k=-1;
                    
                    while(k!=0){
                        if(k==-1){
                            k++;
                            System.out.println("\nIntroduzca el nombre del Grupo de Alimentos:");
                            nomGrupo = s.nextLine();
                            System.out.println(ctrl.inNomGA(nomGrupo));
                            System.out.println("\nPara salir pulse 0: ");
                            k=Integer.parseInt(s.nextLine());
                        }
                    }
            }
        }
    }
    
    public void menuGestionComidas(){
        Scanner s = new Scanner(System.in);
        int i = -1;
        while (i != 0){
            System.out.println("-------------------------------------------------------\n"
                             + "Aplicación de Control de Comidas\n"
                             + "-------------------------------------------------------\n"
                             + "Menú de Gestión de Comidas:\n"
                             + "1. Consultar Comidas\n"
                             + "2. Registrar Comida\n\n"
                             + "0. Salir\n\n"
                             + "Introduzca la operación que desea realizar:");
            i = s.nextInt();
            switch (i) {
                case 1: //Consultar Comidas
                    System.out.println("Introduzca la fecha inicial de consulta:\n"
                                     + "Día:");
                    int di = s.nextInt();
                    System.out.println("Mes:");
                    int mi = s.nextInt();
                    System.out.println("Año:");
                    int ai = s.nextInt();
                    GregorianCalendar inicio = new GregorianCalendar(di, mi, ai);
                    System.out.println("Introduzca la fecha final de consulta:\n"
                                     + "Día:");
                    int df = s.nextInt();
                    System.out.println("Mes:");
                    int mf = s.nextInt();
                    System.out.println("Año:");
                    int af = s.nextInt();
                    GregorianCalendar fin = new GregorianCalendar(df, mf, af);
                    System.out.println(ctrl.inFechas(inicio, fin));
                    break;
                case 2: //Registrar Comida
                    ctrl.registroComida();
                    System.out.println("\nIntroduzca el nombre de la Comida:");
                    String nom = s.nextLine();
                    ctrl.inNomComida(nom);
                    System.out.println("\nIntroduzca el nombre de la Receta que conforma la Comida:");
                    String nomReceta = s.nextLine();
                    if(!ctrl.añadirReceta(nomReceta)){
                        System.out.println("\nLa Receta no existe en el Sistema\n");
                    }
                    int j = -1;
                    while (j != 0){
                        System.out.println("\n¿Desea agregar más Recetas?\n"
                                         + "1. Seguir agregando\n"
                                         + "0. Salir\n");
                        j = s.nextInt();
                        if (i == 1){
                            System.out.println("\nIntroduzca el nombre de la Receta:");
                            nomReceta = s.nextLine();
                            if(!ctrl.añadirAlimento(nomReceta)){
                                System.out.println("\nLa Receta no existe en el Sistema\n");
                            }
                        }else{
                                
                        }
                    }
                    if (!ctrl.confirmarComida()){
                        System.out.println("\nYa existe una Comida con ese nombre en el Sistema\n");
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
