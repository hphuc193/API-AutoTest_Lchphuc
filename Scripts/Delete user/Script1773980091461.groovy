import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

def response = WS.sendRequest(
    findTestObject('Object Repository/DELETE user', ['id': 2])
)

WS.verifyResponseStatusCode(response, 200)