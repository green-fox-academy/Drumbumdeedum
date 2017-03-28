/**
 * Created by danielszalay on 2017. 03. 27..
 */
// Create a method that find the 5 most common lotto numbers assets/lotto.csv

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Lotto {

  public static void main(String[] args) {
    ArrayList<String> crunchifyResult = new ArrayList<String>();
    ArrayList<String> lastFiveDigits = new ArrayList<String>();

    try {
      for (String line : Files.readAllLines(Paths.get("otos.csv"))) {
        if (line != null) {
          String[] splitData = line.split(";");
          for (int i = 0; i < splitData.length; i++) {
            if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
              crunchifyResult.add(splitData[i].trim());
            }
          }
        }
        for (int i = 1; i < 6; i++) {
          lastFiveDigits.add(crunchifyResult.get(crunchifyResult.size() - i));
        }
      }
    } catch (Exception e) {
      System.out.println("Uh-oh, an error happend: " + e.getClass());
    }


    ArrayList<Integer> lottoNumbers = new ArrayList<Integer>();

    for (int i = 0; i < lastFiveDigits.size() ; i++) {
      String stringNumber = lastFiveDigits.get(i);
      Integer intNumber = Integer.parseInt(stringNumber);

      lottoNumbers.add(i, intNumber);
    }

    System.out.println(lastFiveDigits);
    System.out.println(lottoNumbers);

    Collections.sort(lottoNumbers);

    System.out.println(lottoNumbers);
    System.out.println(lottoNumbers.size());


    // first hashmap increasing values

    HashMap<Integer, Integer> mapOfNumbers = new HashMap<>();

    for (int i = 1; i < 91; i++) {
      mapOfNumbers.put(i, 0);
    }

    for (int i=0; i < lottoNumbers.size(); i++) {
      int intTypeString = Integer.parseInt(lastFiveDigits.get(i));
      mapOfNumbers.put(intTypeString, mapOfNumbers.get(intTypeString)+1);
    }
    System.out.println(mapOfNumbers);


    HashMap<Integer, Integer> mapOfOrderedNumbers = new HashMap<>();

    for (int i = 1; i < 200; i++) {
      mapOfOrderedNumbers.put(i, 0);
    }

    for (int i=1; i < mapOfNumbers.size(); i++) {
      mapOfOrderedNumbers.put(mapOfNumbers.get(i), mapOfOrderedNumbers.get(mapOfNumbers.get(i))+1);
    }
    System.out.println(mapOfOrderedNumbers);


    /*ArrayList<ArrayList<Integer>> dictionaryOfNumbers = new ArrayList<ArrayList<Integer>>();

    for (int i = 1; i < 200; i++) {
      dictionaryOfNumbers.add(i, new ArrayList<Integer>());
    }*/
    
  }
}