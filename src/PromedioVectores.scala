

object PromedioVectores {
  def main(args: Array[String]): Unit = {
    val calificaciones = new Array[Array [Double]](6)
    calificaciones(0) = Array(100, 70, 60, 90, 90, 100)
    calificaciones(1) = Array(90, 70, 30, 53, 85, 90)
    calificaciones(2) = Array(100, 100, 90, 81, 87, 80)
    calificaciones(3) = Array(80, 100, 85, 72, 90, 87)
    calificaciones(4) = Array(90, 78, 70, 72, 70, 100)
    calificaciones(5) = Array(100, 83, 92, 79, 83, 90)
    
    for(i <- 0 until promedioParcial(calificaciones).length){//
      System.out.println("El promedio del parcial " +(i+1) + " es: "+promedioParcial(calificaciones)(i))
    }
    
    System.out.println("                ")
    
    for(i <- 0 until promedioMateria(calificaciones).length){//
      System.out.println("El promedio de la materia " +(i+1) + " es: "+promedioMateria(calificaciones)(i))
    }
    
    System.out.println("                  ")
    
    
    System.out.println("El promedio general es: " + promedioGeneral(calificaciones))
    
  }
  
  
  //Funcion promedio parcial
  def promedioParcial(calificaciones : Array[Array [Double]]) : Array[Double] ={
    val promedioP = new Array[Double](6)
    for(i <- 0 until calificaciones.length){
      for(j <- 0 until calificaciones.length){
        promedioP(i) += calificaciones(i)(j)
      }
    }
    for(i <- 0 until calificaciones.length){
      promedioP(i) = promedioP(i)/promedioP.length
      
    }
    return promedioP
  }
  
  //Funcion promedio materia
  def promedioMateria(calificaciones : Array[Array [Double]]) : Array[Double] ={
    val promedioM = new Array[Double](6)
    for(i <- 0 until calificaciones.length){
      for(j <- 0 until calificaciones.length){
        promedioM(j) += calificaciones(i)(j)
      }
    }
    for(i <- 0 until calificaciones.length){
      promedioM(i) = promedioM(i)/promedioM.length
      
    }
    return promedioM
  }
  
  
  //Funcion promedio general
  def promedioGeneral(calificaciones : Array[Array [Double]]) : Double ={
    val promG = new Array[Double](6)
    var pg = 0.0
    for(i <- 0 until calificaciones.length){
      for(j <- 0 until calificaciones.length){
        promG(i) += calificaciones(i)(j)
      }
    }
    for(i <- 0 until promG.length){
      pg += promG(i)
      
    }
    return pg /(promG.length * promG.length)
  }
}