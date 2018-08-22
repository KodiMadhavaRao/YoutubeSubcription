import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YoutubeSubscribe {
    public static void main(String args[]) {
        try {
            String s = readFile("yt.txt");
            ArrayList<String> listOfLinks = getListOfLinks(s);
//            writeToFile(convertListToString(listOfLinks));
            for (int i=0;i<listOfLinks.size();i++)
            {
                sendRequest(listOfLinks.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sendRequest(String url) {
        IYoutubeApi iYoutubeApi = ApiClient.getClient(url).create(IYoutubeApi.class);
        Call<Void> objectCall = iYoutubeApi.setYoutubeSubscription("subscribeEndpoint","sej=%7B%22clickTrackingParams%22%3A%22CBwQmysiEwiu-Zbqh4HdAhXhyHMBHfrnACsomxwyCWNoYW5uZWxzNA%3D%3D%22%2C%22commandMetadata%22%3A%7B%22webCommandMetadata%22%3A%7B%22url%22%3A%22%2Fservice_ajax%22%2C%22sendPost%22%3Atrue%7D%7D%2C%22subscribeEndpoint%22%3A%7B%22channelIds%22%3A%5B%22UCbTLwN10NoCU4WDzLf1JMOA%22%5D%2C%22params%22%3A%22EgIIAg%253D%253D%22%7D%7D&csn=xYx9W-6CM-GRz7sP-s-D2AI&session_token=QUFFLUhqa2Z0azBhcTBIUTFmMFpNM3Y0REJyVFJUaWQ4d3xBQ3Jtc0trX0ZVMXZrMkYxRWxoQk5KUnNENmkxWnBaX243S2Y5LVhzRDZKd3VWRU4wRVpRU2wtaHNsOUNhY09DTVpTOVlkWW1MY0lreFhVcksxVGMzR0c5N1hNek9oQnNKeFo4NVpfZTRiVnhnOWpXVUtFbzZwVTdtamdxWkN1TmduRTd2b1MxbnlkOGpVN29yVHlJZzVXZG5nTEhlVE5ISXc%3D");
        objectCall.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {

            }

            @Override
            public void onFailure(Call<Void> call, Throwable throwable) {

            }
        });
    }

    private static String convertListToString(ArrayList<String> list) {
        String listString = "";
        for (String s : list)
        {
            listString += s + "\n";
        }
        return listString;
    }

    public static String readFile(String filename) throws IOException {
        String content = null;
        File file = new File(filename); // For example, foo.txt
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader != null){
                reader.close();
            }
        }

        return content;
    }
    public static  ArrayList<String> getListOfLinks(String input){
        ArrayList<String> urls=new ArrayList<>();
        Pattern p = Pattern.compile("(?<=<a href=\"/youtube/)(.*)(?=\">)");
        Matcher m = p.matcher(input);
        while(m.find())
        {
            urls.add("https://www.youtube.com/"+m.group(1)); //is your string. do what you want
        }
        return urls;
    }
    public static void writeToFile(String text){
        BufferedWriter output = null;
        try {
            File file = new File("subscribe.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
            if ( output != null ) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
