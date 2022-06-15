package programing;

public class SmartPhone extends Phone {
	protected String osType;
	protected String osVersion;
	protected int internalMemorySize;
	protected String camerainstalled; 
	protected boolean bluetoothSupport;
	
	public SmartPhone(String mfCompany, int price, String communicationType, String osType, String osVersion,
		int internalMemorySize, String camerainstalled, boolean bluetoothSupport) {
		
		super(mfCompany, price, communicationType);		
		this.osType = osType;
		this.osVersion = osVersion;
		this.internalMemorySize = internalMemorySize;
		this.camerainstalled = camerainstalled;
		this.bluetoothSupport = bluetoothSupport;		
	}
	
	public String toString() {
		return mfCompany + price + "원 " + communicationType + osType + osVersion +
				internalMemorySize + camerainstalled + bluetoothSupport; 
	}
	
	public String getOsType() {
		return osType;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public int getInternalMemorySize() {
		return internalMemorySize;
	}

	public String getCamerainstalled() {
		return camerainstalled;
	}

	public boolean getBluetoothSupport() {	 
		return bluetoothSupport;
	}	
		
	public static void main(String[] args) {
		SmartPhone smp = new SmartPhone("삼성", 1000000, "4g", "안드로이드", "1.4", 64, "카메라장착", true );
		System.out.println(smp.toString());
		SmartPhoneFactory fac = new SmartPhoneFactory();
		System.out.println(fac.iphoneSE3());
	}
}
