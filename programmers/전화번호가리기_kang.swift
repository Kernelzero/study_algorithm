func solution(_ phone_number:String) -> String {

    let nonmaskingCount = 4
    let maskingCharacter = "*"
    
    let startIndex = phone_number.index(phone_number.endIndex, offsetBy: -nonmaskingCount)
    let substring = phone_number[startIndex ..< phone_number.endIndex]
    
    let prefixNum:String = String.init(repeating: maskingCharacter,
                                       count: phone_number.count - nonmaskingCount)
    let suffixNum = String(substring)
        
    return prefixNum + suffixNum
}