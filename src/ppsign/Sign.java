package ppsign;

import java.io.FileInputStream;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.util.Base64;

/**
 * Created by zhw on 2018/03/15.
 */
public class Sign {

	/**
	 * 签名算法
	 */
	public static final String SIGNATURE_ALGORITHM = "SHA1WithRSA";

	/**
	 * 
	 * @param msg
	 * @param x509_path
	 * @param sign
	 * @return
	 * @throws Exception
	 */
	public static boolean very(String msg, String x509_path, String sign) throws Exception {
		CertificateFactory cf = CertificateFactory.getInstance("X.509");
		FileInputStream in = new FileInputStream(x509_path);
		java.security.cert.Certificate c = cf.generateCertificate(in);
		Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
		signature.initVerify(c.getPublicKey());
		signature.update(msg.getBytes());
		return signature.verify(Base64.getDecoder().decode(sign));
	}

}