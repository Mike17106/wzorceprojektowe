public class InternetProxy implements Internet {

	private Internet internet = new RealInternet();
	private static List<String> restrictedSites;

	static {
		restrictedSites = new ArrayList<String>();
		restrictedSites.add("jumbxyz.com");
		restrictedSites.add("testme.com");
		restrictedSites.add("adult-site.com");
		restrictedSites.add("bad-site.com");
	}

	@Override
	public void connectTo(String host) throws Exception {

		if(!restrictedSites.contains(host.toLowerCase())){
			internet.connectTo(host);
		}
		throw new Exception("Company restricted this site view");

	}

}



public class ProxyDemo {

	public static void main(String a[]){

		Internet intConn = new InternetProxy();
		try {
			intConn.connectTo("java2novice.com");
			intConn.connectTo("adult-site.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}