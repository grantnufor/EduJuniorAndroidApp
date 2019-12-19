package HttpAdapter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

public class CBTSubjectYearHttpServiceAdapter {


	String SOAP_ADDRESS = "http://studyair.com/WebServices/TESubjectYearServices.asmx";

	public JSONObject GetSubjectYearBySubjectIdAndYearId(String subjectId, String yearId)
	{ 
		String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSubjectYearBySubjectIdAndYearId";
		String OPERATION_NAME_GetJsonData = "GetSubjectYearBySubjectIdAndYearId";

		String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//		String SOAP_ADDRESS ="http://192.168.43.20:90/WebServices/TestEngineServices.asmx";
		Object response=null;

		JSONObject jsonObj = new JSONObject();

		try
		{
			SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
			request.addProperty("subjectId", subjectId);
			request.addProperty("yearId", yearId);
			SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
			envelope.dotNet = true;
			envelope.setOutputSoapObject(request);
			HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
			httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

			response = envelope.getResponse();
			//JSONObject mainJson = new JSONObject(response.toString());

			///JSONArray jsonArray = mainJson.getJSONArrayundefined"student");
			if(response.toString().length()>0 )
			{
				//	       
				String responseModified = "["+response+"]";

				JSONArray aryJSONStrings  = new JSONArray(responseModified.toString());
				//JSONObject jsonObj = new JSONObject();

				//	    int SNO=0;

				for(int i=0; i<aryJSONStrings.length(); i++) {

					jsonObj = (JSONObject)aryJSONStrings.getJSONObject(i);



				}

				//response = jsonObj.get("Email");

			}
			else 
			{
				//response="Empty";
			}

		}
		catch (Exception exception)
		{
			//response="error: "+exception.toString();
			exception.printStackTrace();
			//Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
		}

		return jsonObj;

	}


	public ArrayList<JSONObject> GetSubjectYearBySubjectId(String subjectId)
	{ 
		String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSubjectYearBySubjectId";
		String OPERATION_NAME_GetJsonData = "GetSubjectYearBySubjectId";

		String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//		String SOAP_ADDRESS = "http://www.webservice.studyair.com/PresentationLayer/TestEngineServices.asmx";
		Object response=null;

		ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

		try
		{
			SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
			request.addProperty("subjectId", subjectId);
			SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
			envelope.dotNet = true;
			envelope.setOutputSoapObject(request);
			HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
			httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

			response = envelope.getResponse();




			if(response.toString().length()>0 )
			{       
				//String responseModified = "["+response+"]";

				JSONArray aryJSONStrings  = new JSONArray(response.toString());
				JSONObject jsonObj = new JSONObject();


				for(int i=0; i<aryJSONStrings.length(); i++) {

					jsonObj = (JSONObject)aryJSONStrings.getJSONObject(i);

					obj.add(jsonObj);

				}



			}
			else 
			{
				obj = null;
			}

		}
		catch (Exception exception)
		{
			obj = null;
			exception.printStackTrace();
			//Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
		}

		return obj;

	}


	public ArrayList<JSONObject> GetAllSubjectYear()
	{
		String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllSubjectYears";
		String OPERATION_NAME_GetJsonData = "GetAllSubjectYears";

		String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//		String SOAP_ADDRESS = "http://www.webservice.studyair.com/PresentationLayer/TestEngineServices.asmx";
		Object response=null;

		ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

		try
		{
			SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
			SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
			envelope.dotNet = true;
			envelope.setOutputSoapObject(request);
			HttpTransportSE httpTransport = new HttpTransportSE(SOAP_ADDRESS);
			httpTransport.call(SOAP_ACTION_GetJsonData, envelope);

			response = envelope.getResponse();




			if(response.toString().length()>0 )
			{
				//String responseModified = "["+response+"]";

				JSONArray aryJSONStrings  = new JSONArray(response.toString());
				JSONObject jsonObj = new JSONObject();


				for(int i=0; i<aryJSONStrings.length(); i++) {

					jsonObj = (JSONObject)aryJSONStrings.getJSONObject(i);

					obj.add(jsonObj);

				}



			}
			else
			{
				obj = null;
			}

		}
		catch (Exception exception)
		{
			obj = null;
			exception.printStackTrace();
			//Toast.makeTextundefinedthis, exception.printStackTraceundefined) ,Toast.LENGTH_LONG).showundefined);
		}

		return obj;

	}

}
