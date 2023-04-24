//1773. Count Items Matching a Rule
package Strings;

import java.util.List;

public class ListOfListsMatchkey {

	  public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		  int count = 0;
	        for(int i=0; i<items.size(); i++) {
	            if(ruleKey.equals("type")) {
	                if(ruleValue.equals(items.get(i).get(0))) {
	                    count++;
	                }
	            }
	            else if(ruleKey.equals("color")) {
	                if(ruleValue.equals(items.get(i).get(1))) {
	                    count++;
	                }
	            }
	            else {
	                if(ruleValue.equals(items.get(i).get(2))) {
	                    count++;
	                }
	            }
	        }   
	        return count;
		
	        
	    }
	
	public static void main(String[] args) {

			
			}

	}

