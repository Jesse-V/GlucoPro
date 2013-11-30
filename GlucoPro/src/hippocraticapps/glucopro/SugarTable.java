package hippocraticapps.glucopro;


public class SugarTable implements DatabaseTable{
	@Override
	public void insert(GlucoDBAdapter adptr, Record record) {
		// TODO Auto-generated method stub
		adptr.insertSugarEntry( (SugarRecord)record );
		return;
	}
	static SugarRecord[] peekRange( GlucoDBAdapter adptr,int maxSize ){
		//make an adapter query call to get the nth entry from the top, starting newest first
		return adptr.getNSugarEntries(maxSize); // return array of records
	}
}