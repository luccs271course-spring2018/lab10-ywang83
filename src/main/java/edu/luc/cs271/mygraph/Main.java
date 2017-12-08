package edu.luc.cs271.mygraph;

import java.util.*;
import org.jgrapht.Graph;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.ClosestFirstIterator;
import org.jgrapht.traverse.DepthFirstIterator;

public class Main {

  public static void main(final String[] args) {

    final String FR = countryCodes.FR;
    final String ES = countryCodes.ES;
    final String IT = countryCodes.IT;
    final String CH = countryCodes.CH;
    final String DE = countryCodes.DE;
    final String LU = countryCodes.LU;
    final String BE = countryCodes.BE;

    final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);
    myMap.addVertex(FR);
    myMap.addVertex(ES);
    myMap.addVertex(IT);
    myMap.addVertex(CH);
    myMap.addVertex(DE);
    myMap.addVertex(LU);
    myMap.addVertex(BE);

    myMap.addEdge(countryCodes.FR, countryCodes.ES);
    myMap.addEdge(FR, IT);
    myMap.addEdge(FR, CH);
    myMap.addEdge(FR, DE);
    myMap.addEdge(FR, LU);
    myMap.addEdge(FR, BE);

    myMap.addEdge(IT, CH);
    myMap.addEdge(CH, DE);
    myMap.addEdge(DE, LU);
    myMap.addEdge(DE, BE);
    myMap.addEdge(LU, BE);

    System.out.println(myMap);
    System.out.println("");

    final Iterator<String> bf = new BreadthFirstIterator<>(myMap, FR);
    while (bf.hasNext()) {
      final String country = bf.next();
      System.out.println(country);
    }
    System.out.println("");

    // print nothing
    final Iterator<String> cf = new ClosestFirstIterator<>(myMap, FR);
    while (bf.hasNext()) {
      final String country = cf.next();
      System.out.println(country);
    }
    System.out.println("");

    final Iterator<String> df = new DepthFirstIterator<>(myMap, FR);
    while (df.hasNext()) {
      final String country = df.next();
      System.out.println(country);
    }
    System.out.println("");

    // print infinitly
    //    final Iterator<String> rw = new RandomWalkIterator<>(myMap, FR);
    //    while (rw.hasNext()) {
    //      final String country = rw.next();
    //      System.out.println(country);
    //    }
    //    System.out.println("");

    GreedyColoring map = new GreedyColoring(myMap);
    System.out.println(map.getColoring());
  }
}
