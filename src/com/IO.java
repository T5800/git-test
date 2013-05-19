BufferedReader br = new BufferedReader(new InputStreamReader(
			new FileInputStream("..")));
String str = "";
while( (str = br.readLine()) != null) {
	Pattern p = Pattern.compile(..);
	Matcher m = p.matcher(..);
	System.out.println(..);
}
