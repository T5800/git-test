//get request
String strUrL = "...? . = . &. = ."
URL url = new URL(strUrL);
URLConnection conn = url.openConnection();
conn.setRequestProperty(...);
...
conn.connect();
BufferedReader in = new BufferedReader(
	new InputStreamReader(
		conn.getInputStream()));
String line= "";
while( (line = in.readLine ) != null) {
	syso(line);
}

