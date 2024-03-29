package HttpAdapter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

public class CBTSubjectTypeHttpServiceAdapter {


	String SOAP_ADDRESS = "http://edujunior.co.uk/WebServices/TESubjectTypeServices.asmx";

	public JSONObject GetSubjectTypeBySubjectTypeId(String subjectTypeId)
	{ 
		String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSubjectTypeBySubjectTypeId";
		String OPERATION_NAME_GetJsonData = "GetSubjectTypeBySubjectTypeId";

		String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//		String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/TestEngineServices.asmx";
		Object response=null;

		JSONObject jsonObj = new JSONObject();

		try
		{
			SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
			request.addProperty("subjectTypeId", subjectTypeId);
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


	public ArrayList<JSONObject> GetAllSubjectTypes()
	{
		String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetAllSubjectTypes";
		String OPERATION_NAME_GetJsonData = "GetAllSubjectTypes";

		String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//		String SOAP_ADDRESS = "http://192.168.43.20:90/WebServices/TestEngineServices.asmx";
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


	public JSONObject GetSubjectTypeBySubjectTypeNameAndSubjectYearId(String subjectTypeName, String subjectYearId)
	{ 
		String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSubjectTypeBySubjectTypeNameAndSubjectYearId";
		String OPERATION_NAME_GetJsonData = "GetSubjectTypeBySubjectTypeNameAndSubjectYearId";

		String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//		String SOAP_ADDRESS ="http://www.webservice.studyair.com/PresentationLayer/TestEngineServices.asmx";
		Object response=null;

		JSONObject jsonObj = new JSONObject();

		try
		{
			SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
			request.addProperty("subjectTypeName", subjectTypeName);
			request.addProperty("subjectYearId", subjectYearId);
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


	public ArrayList<JSONObject> GetSubjectTypeBySubjectYearId(String subjectYearId)
	{ 
		String SOAP_ACTION_GetJsonData ="http://tempuri.org/GetSubjectTypeBySubjectYearId";
		String OPERATION_NAME_GetJsonData = "GetSubjectTypeBySubjectYearId";

		String WSDL_TARGET_NAMESPACE ="http://tempuri.org/";
//		String SOAP_ADDRESS = "http://www.webservice.studyair.com/PresentationLayer/TestEngineServices.asmx";
		Object response=null;

		ArrayList<JSONObject> obj = new ArrayList<JSONObject>();//create arraylist of jsonobject to capture all returned objects

		try
		{
			SoapObject request = new SoapObject(WSDL_TARGET_NAMESPACE,OPERATION_NAME_GetJsonData);
			request.addProperty("subjectYearId", subjectYearId);
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
