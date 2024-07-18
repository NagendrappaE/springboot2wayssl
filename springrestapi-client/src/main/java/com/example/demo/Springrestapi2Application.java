package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@RequestMapping("cbs")
public class Springrestapi2Application {

	@Value("${url}")
	private String cbsUrl;
	
	public static void main(String[] args) {
		SpringApplication.run(Springrestapi2Application.class, args);
	}

	@PostMapping("accountInquiry12")
	public String accountEnq() {

		String respons = "{\n" + "   \"accountInquiryRes\":{\n" + "      \"resHdr\":{\n"
				+ "         \"consumerContext\":{\n" + "            \"applicationId\":\"EVL\",\n"
				+ "            \"terminalId\":\"12345\"\n" + "         },\n" + "         \"serviceContext\":{\n"
				+ "            \"uniqueMsgId\":\"83552023110312032671329\",\n"
				+ "            \"reqMsgDateTime\":\"2017-03-21T13:25:18.9151598+05:30\",\n"
				+ "            \"timeZone\":\"2017-03-21T13:25:18.9151598+05:30\",\n"
				+ "            \"serviceName\":\"accountInquiry\",\n" + "            \"serviceVersion\":\"1\",\n"
				+ "            \"conversationId\":\"21212112\",\n" + "            \"parentMsgId\":\"31321212\"\n"
				+ "         },\n" + "         \"providerContext\":{\n" + "            \"providerId\":\"CBS\",\n"
				+ "            \"responseMsgDateTime\":\"2023-11-03T06:35:59.164\"\n" + "         },\n"
				+ "         \"responseStatus\":{\n" + "            \"status\":\"0\",\n"
				+ "            \"esbResDateTime\":\"2023-11-03 12:05:59.175567\"\n" + "         }\n" + "      },\n"
				+ "      \"body\":{\n" + "         \"custId\":\"100112\",\n"
				+ "         \"accountNumber\":\"1100130010000022\",\n" + "         \"title\":\"MR\",\n"
				+ "         \"name\":\"VINAY BAADAM REDDY\",\n" + "         \"branchId\":\"1100\",\n"
				+ "         \"branchDesc\":\"CORPORATE OFFICE\",\n" + "         \"schemeCode\":\"13001\",\n"
				+ "         \"schemeType\":\"TDA\",\n" + "         \"accountOpenDt\":\"2017-04-15T00:00:00.000\",\n"
				+ "         \"accountStatus\":\"A\",\n" + "         \"accountBal\":[\n" + "            {\n"
				+ "               \"balanceType\":\"LEDGER\",\n" + "               \"balanceAmount\":\"1000.00\"\n"
				+ "            },\n" + "            {\n" + "               \"balanceType\":\"AVAIL\",\n"
				+ "               \"balanceAmount\":\"1000.00\"\n" + "            },\n" + "            {\n"
				+ "               \"balanceType\":\"EFFAVL\",\n" + "               \"balanceAmount\":\"1000.00\"\n"
				+ "            },\n" + "            {\n" + "               \"balanceType\":\"FLOAT\",\n"
				+ "               \"balanceAmount\":\"0.00\"\n" + "            },\n" + "            {\n"
				+ "               \"balanceType\":\"LIEN\",\n" + "               \"balanceAmount\":\"0.00\"\n"
				+ "            },\n" + "            {\n" + "               \"balanceType\":\"DRWPWR\",\n"
				+ "               \"balanceAmount\":\"0.00\"\n" + "            },\n" + "            {\n"
				+ "               \"balanceType\":\"ACCBAL\",\n" + "               \"balanceAmount\":\"1000.00\"\n"
				+ "            },\n" + "            {\n" + "               \"balanceType\":\"SHADOW\",\n"
				+ "               \"balanceAmount\":\"0.00\"\n" + "            },\n" + "            {\n"
				+ "               \"balanceType\":\"FUTBAL\",\n" + "               \"balanceAmount\":\"0.00\"\n"
				+ "            }\n" + "         ]\n" + "      }\n" + "   }\n" + "}";

		return respons;

	}

	@GetMapping("fcrjappservlet")
	public String dlxbAccountEqnuiry() {

		String respo = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" + "<Response>\n"
				+ "	<CasaAdditionalInquiryResponse>\n" + "		<ExtendedReply>\n" + "			<MessagesArray/>\n"
				+ "		</ExtendedReply>\n" + "		<ErrorCode>0</ErrorCode>\n"
				+ "		<ExternalReferenceNo>4172120240120000100239767</ExternalReferenceNo>\n"
				+ "		<IsOverriden>false</IsOverriden>\n"
				+ "		<IsServiceChargeApplied>false</IsServiceChargeApplied>\n" + "		<Memo/>\n"
				+ "		<ReplyCode>0</ReplyCode>\n" + "		<ReplyText/>\n" + "		<SpReturnValue>0</SpReturnValue>\n"
				+ "	</CasaAdditionalInquiryResponse>\n" + "	<ProductName>Savings Bank-Resident</ProductName>\n"
				+ "	<ProductCode>1</ProductCode>\n" + "	<JointAccount>\n"
				+ "		<AccountHolderName>KARTHI</AccountHolderName>\n"
				+ "		<AccountRelation>SOW</AccountRelation>\n" + "	</JointAccount>\n"
				+ "	<AcctOpenDate>18-07-2019</AcctOpenDate>\n" + "	<UnclearFunds>0.00</UnclearFunds>\n"
				+ "	<AmountOdLimit>0.00</AmountOdLimit>\n" + "	<AmountHold>0.00</AmountHold>\n"
				+ "	<AcctStatusTxt>ACCOUNT OPEN REGULAR</AcctStatusTxt>\n" + "	<AcctStatusCode>8</AcctStatusCode>\n"
				+ "	<Address1>2/116</Address1>\n" + "	<Address2>SOUTH THOTTAM</Address2>\n"
				+ "	<Address3>KANJAMPATTI</Address3>\n" + "	<City>COIMBATORE</City>\n" + "	<State>TAMIL NADU</State>\n"
				+ "	<PinCode>642003</PinCode>\n" + "	<AcctCurrency>INR</AcctCurrency>\n"
				+ "	<AvailableBalance>3801.12</AvailableBalance>\n" + "	<CombinedBalance>3801.12</CombinedBalance>\n"
				+ "	<ReplicatedFlag>C</ReplicatedFlag>\n" + "	<AccountNumber>006300100170298</AccountNumber>\n"
				+ "	<CustomerId>6814396</CustomerId>\n" + "	<MobileNumber>919976202004</MobileNumber>\n"
				+ "	<EmailId>karthi516382778195@gmail.com</EmailId>\n"
				+ "	<MonthlyAverageBalance>2032.93</MonthlyAverageBalance>\n"
				+ "	<AverageQuarterlyBalance>2032.93</AverageQuarterlyBalance>\n"
				+ "	<MinimumBalance>1000.00</MinimumBalance>\n" + "	<RdInstalmentAmount>0.00</RdInstalmentAmount>\n"
				+ "	<RdInterestRate>0.00</RdInterestRate>\n" + "	<RdMaturityDate/>\n"
				+ "	<RdMaturityAmount>0.00</RdMaturityAmount>\n" + "</Response>";

		String failureResp = "<?xml version=\"1.0\"?> <Exception><ErrorCode>2778</ErrorCode><ErrorMessage>Account not found</ErrorMessage><StackTrace/><Response>99</Response><Reason><Code>29</Code><Message>Internal OLTP Error.</Message></Reason></Exception>";
		return respo;
		// return failureResp;
	}

	@GetMapping("fcrjappservletcust")
	public String dlxbCustoerEqnuiry() {

		String respo = "<Response>\n" + "	<CustomerAccountDetailsInquiryResponse>\n" + "		<ExtendedReply>\n"
				+ "			<MessagesArray/>\n" + "		</ExtendedReply>\n" + "		<ErrorCode>0</ErrorCode>\n"
				+ "		<ExternalReferenceNo>4172120240120000100345428</ExternalReferenceNo>\n"
				+ "		<IsOverriden>false</IsOverriden>\n"
				+ "		<IsServiceChargeApplied>false</IsServiceChargeApplied>\n" + "		<Memo/>\n"
				+ "		<ReplyCode>0</ReplyCode>\n" + "		<ReplyText/>\n" + "		<SpReturnValue>0</SpReturnValue>\n"
				+ "	</CustomerAccountDetailsInquiryResponse>\n" + "	<CustomerId>62930</CustomerId>\n"
				+ "	<CustFullName>OMANA KUMARAN NAIR</CustFullName>\n"
				+ "	<CustMobileNumber>919920294892</CustMobileNumber>\n"
				+ "	<CustEmail>vinodk32@gmail.com</CustEmail>\n"
				+ "	<CustAddress1>OPP MAHESHWARI UDYAN R NO 11</CustAddress1>\n"
				+ "	<CustAddress2>MANU MAHAL DR AMBEDKAR ROAD</CustAddress2>\n"
				+ "	<CustAddress3>KINGS CIRCLE MATUNGA MUMBAI</CustAddress3>\n"
				+ "	<CustCity>BRIHAN MUMBAI</CustCity>\n" + "	<CustState>MAHARASHTRA</CustState>\n"
				+ "	<CustCountry>India</CustCountry>\n" + "	<CustZip>400019</CustZip>\n"
				+ "	<CustPermanantAddress1>OPP MAHESHWARI UDYAN R NO 11</CustPermanantAddress1>\n"
				+ "	<CustPermanantAddress2>MANU MAHAL DR AMBEDKAR ROAD</CustPermanantAddress2>\n"
				+ "	<CustPermanantAddress3>KINGS CIRCLE MATUNGA MUMBAI</CustPermanantAddress3>\n"
				+ "	<CustPermanantCity>BRIHAN MUMBAI</CustPermanantCity>\n"
				+ "	<CustPermanantCountry>India</CustPermanantCountry>\n"
				+ "	<CustPermanantState>MAHARASHTRA</CustPermanantState>\n"
				+ "	<CustPermanantZip>400019</CustPermanantZip>\n" + "	<CustDateOfBirth>16-01-1959</CustDateOfBirth>\n"
				+ "	<CustSex>F</CustSex>\n" + "	<CustPhone>02224142211</CustPhone>\n" + "	<CASA_AccountList>\n"
				+ "		<ChAccount>\n" + "			<AccountNumber>012400100019920 </AccountNumber>\n"
				+ "			<AccountType>CASA</AccountType>\n" + "			<BranchCode>124-MATUNGA</BranchCode>\n"
				+ "			<BranchName>MATUNGA</BranchName>\n" + "			<NetBankingFlag>Y</NetBankingFlag>\n"
				+ "			<ProductCode>1</ProductCode>\n"
				+ "			<ProductName>1-Savings Bank-Resident</ProductName>\n"
				+ "			<ProductType>CH</ProductType>\n"
				+ "			<AvailableBalance>4834844.62</AvailableBalance>\n"
				+ "			<AccountRelation>JOF</AccountRelation>\n" + "			<NomineeId>0</NomineeId>\n"
				+ "			<NomineeName/>\n" + "			<FlgOnline>N</FlgOnline>\n" + "			<IntRate/>\n"
				+ "			<CurrencyName>INR</CurrencyName>\n" + "		</ChAccount>\n" + "		<ChAccount>\n"
				+ "			<AccountNumber>012405300004902 </AccountNumber>\n"
				+ "			<AccountType>CASA</AccountType>\n" + "			<BranchCode>124-MATUNGA</BranchCode>\n"
				+ "			<BranchName>MATUNGA</BranchName>\n" + "			<NetBankingFlag>Y</NetBankingFlag>\n"
				+ "			<ProductCode>53</ProductCode>\n"
				+ "			<ProductName>53-Current Account- Resident</ProductName>\n"
				+ "			<ProductType>CH</ProductType>\n"
				+ "			<AvailableBalance>353378.52</AvailableBalance>\n"
				+ "			<AccountRelation>JOF</AccountRelation>\n" + "			<NomineeId>199120</NomineeId>\n"
				+ "			<NomineeName>KUMARAN NAIR C</NomineeName>\n" + "			<FlgOnline>N</FlgOnline>\n"
				+ "			<IntRate/>\n" + "			<CurrencyName>INR</CurrencyName>\n" + "		</ChAccount>\n"
				+ "	</CASA_AccountList>\n" + "	<TermDeposit_AccountList>\n" + "		<TDAccount>\n"
				+ "			<AccountNumber>012444300002735</AccountNumber>\n"
				+ "			<DepositCode>1</DepositCode>\n" + "			<BranchName>MATUNGA</BranchName>\n"
				+ "			<ProductCode>443</ProductCode>\n"
				+ "			<ProductName>443-FDR-SDC (Senior Citizen-Anniversary)</ProductName>\n"
				+ "			<ProductType>TD</ProductType>\n"
				+ "			<AvailableBalance>5000000.00</AvailableBalance>\n"
				+ "			<AccountRelation>SOW</AccountRelation>\n" + "			<LienMarked>N</LienMarked>\n"
				+ "			<DepositPrint>Y</DepositPrint>\n"
				+ "			<PrincipalAmount>5000000.00</PrincipalAmount>\n"
				+ "			<InterestRate>7.75</InterestRate>\n" + "			<BranchCode>124-MATUNGA</BranchCode>\n"
				+ "			<NomineeId>9901742594</NomineeId>\n"
				+ "			<NomineeName>VINOD KUMAR NAIR</NomineeName>\n" + "			<FlgOnline>N</FlgOnline>\n"
				+ "			<CurrencyName>INR</CurrencyName>\n" + "		</TDAccount>\n"
				+ "	</TermDeposit_AccountList>\n" + "	<Loan_AccountList/>\n" + "	<CreditCardNo/>\n"
				+ "	<CreditCardExpiryDate/>\n" + "	<CreditCardStatus/>\n" + "	<CustomerType>I</CustomerType>\n"
				+ "	<BranchCode>124</BranchCode>\n" + "	<BranchName>MATUNGA-MUMBAI</BranchName>\n"
				+ "	<PanNo>ACAPN7628P</PanNo>\n" + "	<AadhaarRefNo>DELG64W3YGULYFVSCF</AadhaarRefNo>\n"
				+ "	<NreFlag>Y</NreFlag>\n" + "	<Staff>N</Staff>\n" + "	<KycStatus>C</KycStatus>\n" + "</Response>";

		return respo;
	}

	@GetMapping("ctrlservlet")
	public String dlxbAadharValt() {

		String respo = "<faml>\n" + "	<Status>success</Status>\n" + "	<EntryTime>2023-06-03T11:32:48</EntryTime>\n"
				+ "	<Uid>844341324075</Uid>\n" + "	<UidForDisplay>XXXXXXXXX874</UidForDisplay>\n"
				+ "	<UidReferenceKey>DMEMBL7F1P1MT9BRD5</UidReferenceKey>\n" + "	<ErrorCode></ErrorCode>\n"
				+ "</faml>";

		String failedResp = "<faml> <Status>failed</Status> <EntryTime></EntryTime> <Uid></Uid> <UidForDisplay></UidForDisplay> <UidReferenceKey></UidReferenceKey> <ErrorCode>Entry not found</ErrorCode> </faml>";
		return respo;
	}

	@GetMapping("SendSMS")
	public String flxbSmsResponse() {

		String resp = "{\"status\":1,\"message\":\"success\"}";
		return resp;
	}

	@GetMapping("/bankservices/process")
	public String esafAccountEnq() {

		String resp = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" + "<Response>\n"
				+ "	<AccountListDetails>\n" + "		<AccountList>\n"
				+ "			<Aadhar-MapperId>5337</Aadhar-MapperId>\n" + "			<AadharNumber></AadharNumber>\n"
				+ "			<AccountStatus>Active</AccountStatus>\n" + "			<Balance>1000385.42</Balance>\n"
				+ "			<customerName>Neha  Antony</customerName>\n"
				+ "			<CustomerNumber>230000001719</CustomerNumber>\n"
				+ "			<Masked-AadharNumber>4075</Masked-AadharNumber>\n"
				+ "			<MobileNumber>7593002194</MobileNumber>\n"
				+ "			<Mode-of-Operation>1</Mode-of-Operation>\n"
				+ "			<MOP-Description>SELF</MOP-Description>\n" + "			<TaxID></TaxID>\n"
				+ "			<AccountRestriction></AccountRestriction>\n"
				+ "			<Account-RestrictionType></Account-RestrictionType>\n"
				+ "			<ProductType>504</ProductType>\n"
				+ "			<ProductTypeDescr>SB Regular</ProductTypeDescr>\n" + "		</AccountList>\n"
				+ "	</AccountListDetails>\n" + "	<TransactionStatus>\n" + "		<ErrorCode>0</ErrorCode>\n"
				+ "		<ExternalReferenceNo>30265678999</ExternalReferenceNo>\n" + "		<ReplyCode>0</ReplyCode>\n"
				+ "		<ReplyText>Success</ReplyText>\n" + "	</TransactionStatus>\n" + "</Response>";
		return resp;
	}

	@GetMapping("/otac/generate/ESAF/{data}")
	public String esafOtpGenerate() {

		String rresp = "{\"refnum\":\"\",\"expires\":1706783386799,\"otac\":\"641813\",\"userid\":\"918999480905\",\"feid\":\"ESAF\"}";
		return rresp;
	}

	@GetMapping("/otac/validate/ESAF/{data}")
	public String esafvalidateGenerate() {

		String rresp = "{\n" + "    \"userid\": \"8999480905\",\n" + "    \"refnum\": \"8999480905\",\n"
				+ "    \"feid\": \"ESAF\",\n" + "    \"code\": \"00\"\n" + "}";
		return rresp;
	}

	@GetMapping("debitcard")
	public void posting() {
		String requestStr = "<soapenv:Envelope\n"
				+ "	xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"\n"
				+ "	xmlns:in=\"http://in.co.federalbank\">\n"
				+ "	<soapenv:Header/>\n"
				+ "	<soapenv:Body>\n"
				+ "		<in:Request>\n"
				+ "			<ServiceAccessId>GENAUTHCD</ServiceAccessId>\n"
				+ "			<ServiceAccessCode>test@123</ServiceAccessCode>\n"
				+ "			<!--Optional:-->\n"
				+ "			<RequestType>PIN_VALIDATE</RequestType>\n"
				+ "			<RequestID> 2603202414381</RequestID>\n"
				+ "			<PAN>6521818101068205</PAN>\n"
				+ "			<PIN>1995</PIN>\n"
				+ "			<ExpiryDate>2509</ExpiryDate>\n"
				+ "			<!--Optional:-->\n"
				+ "			<CardStatus></CardStatus>\n"
				+ "			<!--Optional:-->\n"
				+ "			<CVV></CVV>\n"
				+ "		</in:Request>\n"
				+ "	</soapenv:Body>\n"
				+ "</soapenv:Envelope>";
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_XML_VALUE);
		headers.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<String> entity = new HttpEntity<>(requestStr, headers);
		/*
		 * HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() { public
		 * boolean verify(String hostname, SSLSession session) { return true; } });
		 */
		
		RestTemplate restTemplate=new RestTemplate();
		try {
			ResponseEntity<String> responseEntity = restTemplate.exchange(cbsUrl, HttpMethod.POST, entity, String.class);
			String response = responseEntity.getBody();
			System.out.println("final Response"+response);	
		}catch(Exception e) {
			e.printStackTrace();
		}
	

	}
}
