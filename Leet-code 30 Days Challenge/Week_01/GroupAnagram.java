package Week_01;

import java.util.*;

/*Group Anagrams
 
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter.
 * */
public class GroupAnagram {
	public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map =new HashMap<>();
        int n =strs.length;
        for(int i=0;i<n;i++)
        {
            String s= strs[i];
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String s2= new String(arr);
            if(map.containsKey(s2)){
                map.get(s2).add(s);
            }
            else{
                List<String> list =new ArrayList<>();
                list.add(s);
                map.put(s2,list);
            }
            
        }
        List<List<String>> res= new ArrayList<>();
        for(String s : map.keySet())
        {
            List<String> list = map.get(s);
            res.add(list);
        }
        return res;
    }
	public static void main(String[] args) {
		String str[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> res=	groupAnagrams(str);
		System.out.println(res);
	}
}
