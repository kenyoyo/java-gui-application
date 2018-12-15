
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KAZDO
 */
public class SubnetCalculator {
    private String networkClass;
    private String ipAddress;
    private String subnetMask;
    private int subnetBit;
    private int maskBit;
    private int maximumSubnet;
    private int hostPerSubnet;
    
    public SubnetCalculator(String c, String ip, String sm, int sb, int mb, int ms, int hps) {
        networkClass = c;
        ipAddress = ip;
        subnetMask = sm;
        subnetBit = sb;
        maskBit = mb;
        maximumSubnet = ms;
        hostPerSubnet = hps;
    }
    //set and get method 
    public void setNetworkClass(String c) {networkClass = c;}    
    public void setSubnetMask(String sm) {subnetMask = sm;}
    public void setSubnetBit(int sb) {subnetBit = sb;}
    public void setMaskBit(int mb) {maskBit = mb;}
    public void setMaximumSubnet(int ms) {maximumSubnet = ms;}    
    public void setHostPerSubnet(int hps) {hostPerSubnet = hps;}
    public void setIPAdress(String ip) {
        try {
            String[] ipOctet = ip.split(Pattern.quote("."));
            if(ipOctet.length != 4)
                throw new Exception();
            for(int i=0; i<ipOctet.length; i++) {
                Integer.parseInt(ipOctet[i]);
            }
            String[] range = getFirstOctetRange().split(" - ");
            if(Integer.parseInt(ipOctet[0]) < Integer.parseInt(range[0]) 
               || Integer.parseInt(ipOctet[0]) > Integer.parseInt(range[1])
               || Integer.parseInt(ipOctet[1]) < 0 || Integer.parseInt(ipOctet[1]) > 255 
               || Integer.parseInt(ipOctet[2]) < 0 || Integer.parseInt(ipOctet[2]) > 255
               || Integer.parseInt(ipOctet[3]) < 0 || Integer.parseInt(ipOctet[3]) > 255){
                throw new Exception();
            }
            else
                ipAddress = ip;
        } catch (Exception ec) {
            ipAddress = getDefaultIPAddress();    
        }
    }
    
    public String getNetworkClass() {return networkClass;}    
    public String getIPAddress() {return ipAddress;}    
    public String getSubnetMask() {return subnetMask;}    
    public String getSubnetBit() {return subnetBit+"";}    
    public String getMaskBit() {return maskBit+"";}    
    public String getMaximumSubnet() {return maximumSubnet+"";}    
    public String getHostPerSubnet() {return hostPerSubnet+"";}
    
    public String getDefaultIPAddress() {
        if(networkClass.equals("A"))
            return "10.0.0.1";
        else if(networkClass.equals("B"))
            return "172.16.0.1";
        else
            return "192.168.0.1";
    }
    
    public void syncSubnetMask(String syncFrom) {
    //check from Network Class
        subnetMask = "";
        if(syncFrom.equals("SubnetBit")) {
            String subnetMaskBit = "";
            if (networkClass.equals("A")) {
                subnetMaskBit = "11111111";
                for(int i=0; i<24; i++) {
                    if(i<subnetBit)
                        subnetMaskBit += "1";
                    else
                        subnetMaskBit += "0";
                }
                
            } else if (networkClass.equals("B")) {
                subnetMaskBit = "1111111111111111";
                for(int i=0; i<16; i++) {
                    if(i<subnetBit)
                        subnetMaskBit += "1";
                    else
                        subnetMaskBit += "0";
                }
            } else {
                subnetMaskBit = "111111111111111111111111";
                for(int i=0; i<8; i++) {
                    if(i<subnetBit)
                        subnetMaskBit += "1";
                    else
                        subnetMaskBit += "0";
                }
            }
            for(int i=0; i<32; i+=8) {                
                subnetMask += convertBitToDecimal(subnetMaskBit.substring(i, i+8)) + ".";
            }
            subnetMask = subnetMask.substring(0, subnetMask.length()-1);
            
        } else if (syncFrom.equals("MaskBit")) {
            String subnetMaskBit = "";
            for(int i = 0; i<32; i++) {
                if(i<maskBit) {
                    subnetMaskBit += "1";    
                }
                else
                    subnetMaskBit += "0";
            }
            
            for(int i=0; i<32; i+=8) {                
                subnetMask += convertBitToDecimal(subnetMaskBit.substring(i, i+8)) + ".";
            }
            subnetMask = subnetMask.substring(0, subnetMask.length()-1);
            
        } else if (syncFrom.equals("MaximumSubnet")) {
            int maximum = maximumSubnet;
            String subnetMaskBit = "";
            if (networkClass.equals("A")) {
                subnetMaskBit = "11111111";                
                for(int i=0; i<24; i++) {
                    if(maximum > 1) {
                        subnetMaskBit += "1";
                        maximum /= 2;
                    }
                    else
                        subnetMaskBit += "0";
                }
            } else if (networkClass.equals("B")) {
                subnetMaskBit = "1111111111111111";
                for(int i=0; i<16; i++) {
                    if(maximum > 1) {
                        subnetMaskBit += "1";
                        maximum /= 2;
                    }
                    else
                        subnetMaskBit += "0";
                }
            } else {
                subnetMaskBit = "111111111111111111111111";
                for(int i=0; i<8; i++) {
                    if(maximum > 1) {
                        subnetMaskBit += "1";
                        maximum /= 2;
                    }
                    else
                        subnetMaskBit += "0";
                }
            }
            
            for(int i=0; i<32; i+=8) {                
                subnetMask += convertBitToDecimal(subnetMaskBit.substring(i, i+8)) + ".";
            }
            subnetMask = subnetMask.substring(0, subnetMask.length()-1);
            
        } else if (syncFrom.equals("HostPerSubnet")){
            int perSub = hostPerSubnet+2;
            int count=0;
            String subnetMaskBit = "";
            while(perSub > 1) {
                perSub /= 2;
                count++;
            }
            
            for(int i=32; i>0; i--) {
                if(i>count)
                    subnetMaskBit += "1";
                else
                    subnetMaskBit += "0";
            }
            
            for(int i=0; i<32; i+=8) {                
                subnetMask += convertBitToDecimal(subnetMaskBit.substring(i, i+8)) + ".";
            }
                subnetMask = subnetMask.substring(0, subnetMask.length()-1);
        }
        
        
    }
    
    public void syncSubnetBit() {
    //check from subnet Mask and NetworkClass
        subnetBit = 0;
        String[] subnetMaskOctet = subnetMask.split(Pattern.quote("."));
        if (networkClass.equals("A")) {
            for(int i=1; i<4; i++) {
                String bit = convertDecimalToBit(subnetMaskOctet[i]);
                for(int j=0; j<bit.length(); j++) {
                    if(bit.charAt(j) == '1')
                        subnetBit++;
                }
            }
        } else if (networkClass.equals("B")) {
            for(int i=2; i<4; i++) {
                String bit = convertDecimalToBit(subnetMaskOctet[i]);
                for(int j=0; j<bit.length(); j++) {
                    if(bit.charAt(j) == '1')
                        subnetBit++;
                }
            }
        } else {
            for(int i=3; i<4; i++) {
                String bit = convertDecimalToBit(subnetMaskOctet[i]);
                for(int j=0; j<bit.length(); j++) {
                    if(bit.charAt(j) == '1')
                        subnetBit++;
                }
            }
        }
    }
    
    public void syncMaskBit() {
    //check from NetworkClass + SubnetBits
        if (networkClass.equals("A")) {
            maskBit = 8 + subnetBit;
        } else if (networkClass.equals("B")) {
            maskBit = 16 + subnetBit;
        } else {
            maskBit = 24 + subnetBit;
        }
    }
    
    public void syncMaximumSubnet() {
    //check from Subnet Bits
        maximumSubnet = (int) Math.pow(2, subnetBit);
    }
    
    public void syncHostPerSubnet() {
    //check from hostbit in Subnet Bitmap
        hostPerSubnet = (int) Math.pow(2, 32-maskBit)-2;
    }
    
    //special get data method
    
    public String getFirstOctetRange() {
        if(networkClass.equals("A"))
            return "0 - 127";
        else if(networkClass.equals("B"))
            return "128 - 191";
        else
            return "192 - 223";
    }
    
    public String getHexIpAddress() {
        //check from Ip Address
        String hexIpAddress = "";
        String[] IPOctet = ipAddress.split(Pattern.quote("."));
        for(int i=0; i<IPOctet.length; i++){
            hexIpAddress += (convertDecimalToHexadcimal(IPOctet[i])) + ".";
        }
        
        return hexIpAddress.substring(0, hexIpAddress.length()-1);
    }
    
    public String getWildcardMask() {
        //check from subnet Mask
        String wildcardMask = "";
        String[] subnetMaskOctet = subnetMask.split(Pattern.quote("."));
        for(int i=0; i<subnetMaskOctet.length; i++){
            wildcardMask += (255 - Integer.parseInt(subnetMaskOctet[i])) + ".";
        }
        
        return wildcardMask.substring(0,wildcardMask.length()-1);
    }
    
    public String getHostAddressRange() {
        //check from SubnetId and Broadcast Address
        String[] subnetIdOctet = getSubnetId().split(Pattern.quote("."));
        String lastOctet = ""+(Integer.parseInt(subnetIdOctet[3]) + 1);
        subnetIdOctet[3] = lastOctet;
        
        String[] broadcastAddressOctet = getBroadcastAddress().split(Pattern.quote("."));
        lastOctet = ""+(Integer.parseInt(broadcastAddressOctet[3]) - 1);
        broadcastAddressOctet[3] = lastOctet;
        
        String start = "";
        String end = "";
        for(int i=0; i<4; i++) {
            start += subnetIdOctet[i] + ".";
            end += broadcastAddressOctet[i] + ".";
        }
            
        
        return start.substring(0, start.length()-1)+ " - " + end.substring(0, end.length()-1);
    }
    
    public String getSubnetId() {
        //check from IP Address and Subnet Mask
        String subnetId = "";
        String[] ipAddressOctet = ipAddress.split(Pattern.quote("."));
        String[] subnetMaskOctet = subnetMask.split(Pattern.quote("."));
        
        for(int i=0; i<ipAddressOctet.length; i++){
            subnetId += convertBitToDecimal(andBitOperation
                        (convertDecimalToBit(ipAddressOctet[i])
                        ,convertDecimalToBit(subnetMaskOctet[i]))) + ".";
        }
        
        return subnetId.substring(0, subnetId.length()-1);
    }
    
    public String getBroadcastAddress() {
        String broadcastBit = "";
        String[] subnetIdOctet = getSubnetId().split(Pattern.quote("."));
        String subnetBit = "";
        for(int i=0; i<subnetIdOctet.length; i++)
            subnetBit += convertDecimalToBit(subnetIdOctet[i]) + ".";
        subnetBit = subnetBit.substring(0, subnetBit.length()-1);
        int passBit = 0;
        for(int i=0; i<subnetBit.length(); i++){
            if(passBit >= maskBit && subnetBit.charAt(i) != '.') {
                broadcastBit += "1";
            }
            else if(subnetBit.charAt(i) != '.') {
                broadcastBit += "" + subnetBit.charAt(i);
                passBit += 1;
            }
            else
                broadcastBit += ".";
        }
        String broadcastAddress = "";
        String[] broadcastOctet = broadcastBit.split(Pattern.quote("."));
        for(int i=0; i<broadcastOctet.length; i++) 
            broadcastAddress += convertBitToDecimal(broadcastOctet[i]) + ".";
            
        return broadcastAddress.substring(0, broadcastAddress.length()-1);
    }
    
    public String getSubnetBitmap() {
        //check from Network Class and Subnet Bits
        String subnetBitmap = "";
        int totalSubnetBit = subnetBit;
        int dotPosition = 9;
        if (networkClass.equals("A")) {
            subnetBitmap += "0nnnnnnn.";
            for(int i = 1; i < 27; i++) {
                if(i % dotPosition == 0) {
                    subnetBitmap += ".";
                } else if(totalSubnetBit > 0) {
                    subnetBitmap += "s";
                    totalSubnetBit--;
                } else
                    subnetBitmap += "h";
            }
        } else if (networkClass.equals("B")) {
            subnetBitmap += "10nnnnnn.nnnnnnnn.";
            for(int i = 1; i < 18; i++) {
                if(i % dotPosition == 0) {
                    subnetBitmap += ".";
                } else if(totalSubnetBit > 0) {
                    subnetBitmap += "s";
                    totalSubnetBit--;
                }
                else
                    subnetBitmap += "h";
            }
        } else {
            subnetBitmap += "110nnnnn.nnnnnnnn.nnnnnnnn.";
            for(int i = 0; i < 8; i++) {
                if(i < subnetBit)
                    subnetBitmap += "s";
                else
                    subnetBitmap += "h";
            }
        }
        
        return subnetBitmap;
    }
    
    public String getPercentUse() {
        double percent;
        if(networkClass.equals("A")) {
            percent = ((maximumSubnet * hostPerSubnet)/16777214.0)*100;
            //percent =  (((Math.pow(2, subnetBit)-2)*hostPerSubnet)/16777214)*100;
        }
         
        else if(networkClass.equals("B")) {
            percent = ((maximumSubnet * hostPerSubnet)/65534.0)*100;
            //percent = (((Math.pow(2, subnetBit)-2)*hostPerSubnet)/65534)*100;
        }
        
        else {
            percent = ((maximumSubnet * hostPerSubnet)/254.0)*100;
            //percent = (((Math.pow(2, subnetBit)-2)*hostPerSubnet)/254)*100;
        }
        
        //if(percent <= 0)
        //    return "100%";
        return Math.round(percent)+"%";
    }
    
    public String toString() {
        return "networkClass: " + networkClass + "\nIPAdress: " + ipAddress +
                "\nsubnetMask: " + subnetMask + "\nsubnetBit: " + subnetBit +
                "\nmaskBit: " + maskBit + "\nmaximumSubnet: " + maximumSubnet +
                "\nhostPerSubnet: " + hostPerSubnet + "\nFirstOctetRange: " +
                getFirstOctetRange() + "\nHexIpAddress: " + getHexIpAddress() +
                "\nWildCardMask: " + getWildcardMask() + "\nHostAddressRange: " +
                getHostAddressRange() + "\nSubnetId: " + getSubnetId() +
                "\nBroadcastAddress: " + getBroadcastAddress() + "\nSubnetBitmap: "
                + getSubnetBitmap() + "\n";
    }
    
    public String convertDecimalToBit(String decimal) {
        int toInt = Integer.parseInt(decimal);
        String bit = "";
        for(int i = 7; i>=0; i--) {
            if(Math.pow(2, i) <= toInt) {
                bit += "1";
                toInt -= Math.pow(2, i);
            } else {
                bit += "0";
            }
        }
            
        return bit;    
    }
    
    public String convertBitToDecimal(String bit) {
        int decimal = 0;
        for(int i=0; i<8; i++){
            if(bit.charAt(i) == '1')
                decimal += Math.pow(2, (7-i));
        }
        
        return ""+decimal;
    }
    
    public String convertDecimalToHexadcimal(String decimal) {
        int toInt = Integer.parseInt(decimal);
        String bit = "";
        for(int i = 1; i>=0; i--) {
            int inHex = (toInt / (int) Math.pow(16, i));
            if(inHex >= 10) {
                if(inHex == 10)
                    bit += "A";
                else if(inHex == 11)
                    bit += "B";
                else if(inHex == 12)
                    bit += "C";
                else if(inHex == 13)
                    bit += "D";
                else if(inHex == 14)
                    bit += "E";
                else if(inHex == 15)
                    bit += "F";
            } else     
                bit += "" + inHex;
            toInt -= inHex*Math.pow(16, i);
        }
            
        return bit;
    }
    
    public String andBitOperation(String bit1, String bit2) {
        String answerBit = "";
        for(int i=0; i<8; i++) {
            if(bit1.charAt(i) == '0' || bit2.charAt(i) == '0')
                answerBit += "0";
            else
                answerBit += "1";
        }
        
        return answerBit;
    }
}
