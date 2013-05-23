URL url = new URL(urlStr);//
//here, the urlStr doesn't have & = ? ...
URLConnection conn = url.openConnection();
conn.setRequestProperty() 
....
out = new PrintWriter(conn.getOutputStream());
out.print(request message);
out.flush();
in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
read  the message...
close();

