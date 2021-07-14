//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//import com.google.gson.*;
//import java.net.*;
//
//
//class Result {
//
//    /*
//     * Complete the 'getArticleTitles' function below.
//     *
//     * The function is expected to return a STRING_ARRAY.
//     * The function accepts STRING author as parameter.
//     *
//     * URL for cut and paste:
//     * https://jsonmock.hackerrank.com/api/articles?author=<authorName>&page=<num>
//     *
//     */
//
//    public static List<String> getArticleTitles(String author) {
//        List<String> result = new ArrayList<>();
//
//        String response;
//        int startPage = 1;
//        int totalPages = Integer.MAX_VALUE;
//        List<String> titles = new ArrayList<>();
//        while (startPage <= totalPages) {
//            try {
//                URL obj = new URL("https://jsonmock.hackerrank.com/api/articles?author=" + author + "&page=" + startPage);
//                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//                con.setRequestMethod("GET");
//                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//                while ((response = in.readLine()) != null) {
//                    JsonObject convertedObject = new Gson().fromJson(response, JsonObject.class);
//                    totalPages = convertedObject.get("total_pages").getAsInt();
//                    JsonArray data = convertedObject.getAsJsonArray("data");
//                    for (int i = 0; i < data.size(); i++) {
//                        if(!data.get(i).getAsJsonObject().get("title").isJsonNull()){
//                            String title = data.get(i).getAsJsonObject().get("title").getAsString();
//                            titles.add(title);
//                        } else {
//                            String sTitle = data.get(i).getAsJsonObject().get("story_title").getAsString();
//                            if(sTitle != null){
//                                titles.add(sTitle);
//                            }
//                        }
//                    }
//                }
//                in.close();
//                startPage++;
//            } catch (Exception ex) {
//                ex.printStackTrace();
//                return null;
//            }
//        }
//        return titles;
//    }
//
//}
//
//class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String author = bufferedReader.readLine();
//
//        List<String> result = Result.getArticleTitles(author);
//
//        bufferedWriter.write(
//                result.stream()
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
