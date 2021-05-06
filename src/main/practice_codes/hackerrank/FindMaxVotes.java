package practice_codes.hackerrank;

import java.util.ArrayList;

/*
 *
 *
 *
 * */

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMaxVotes {

    public static void main(String[] args) {

        ArrayList<String> votes = new ArrayList<String>(Arrays.asList("Gulab-jamun","Laddu","Jalebi","Barfi","Laddu","Gulab-jamun","Gulab-jamun","Jalebi","Gajar-halwa","Gajar-halwa","Barfi","Gajar-halwa"));

        System.out.println("Max Votes for : " + maxSweet(votes));
    }

	public static String maxSweet(ArrayList<String> votes) {		
		HashMap<String, Integer> voteCount = addSweetVoteInMap(votes);	
		List<String> maxVotesSweet = getMaxVoteSweets(voteCount);
		return sortAndGetMax(maxVotesSweet);
	}

	private static String sortAndGetMax(List<String> maxVotesSweet) {
		//sort using collection sort
		Collections.sort(maxVotesSweet);
		return maxVotesSweet.get(maxVotesSweet.size()-1);
	}

	private static List<String> getMaxVoteSweets(HashMap<String, Integer> voteCount) {
		return voteCount.entrySet().stream()
				.filter(entry -> entry.getValue()==Collections.max(voteCount.values()))
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
	}

	private static HashMap<String, Integer> addSweetVoteInMap(ArrayList<String> votes) {
		HashMap<String, Integer> voteCount = new HashMap<String, Integer>();
		for(int i=0; i<votes.size(); i++) {
			String key = votes.get(i);
			if(voteCount.containsKey(key)) {
				voteCount.put(key, voteCount.get(key)+1);
			} else {
				voteCount.put(key, 1);
			}
		}
		return voteCount;
	}

}

/**
 * different sorting ways::

		//sort using list
		maxVotesSweet.sort(Comparator.comparing(String::toString));
		
		//sort string list manually
		//Sorting the strings
		String temp;
        for (int i = 0; i < maxVotesSweet.size(); i++) 
        {
            for (int j = i + 1; j < maxVotesSweet.size(); j++) { 
                if (maxVotesSweet.get(i).compareTo(maxVotesSweet.get(j))>0) 
                {
                    temp = maxVotesSweet.get(i);
                    maxVotesSweet.set(i, maxVotesSweet.get(j));
                    maxVotesSweet.set(j, temp);
                }
            }
        }

 * 
*/
