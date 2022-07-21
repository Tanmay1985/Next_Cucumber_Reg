Feature: User Registering New Account
  Scenario: User Registering with different data
    Given User is on Registration page
    When User enters following details
    | Field Name | Values |
    | Select Title | Mr |
    | First Name | Tanmay |
    | Last Name | Vyas |
    | Email | tanmay@vyas.com |
    | Password | Abc123 |
    | Show Button | Click |
    | Date of Birth | 01/01/90 |
    | Contact Telephone | 0123456789 |
    | House No./Name | 1603 |
    | Postcode | IG11 7PY |
    | Search Find Options | Click |
    | Tick Relevent Box | By Post |
    | Terms and Conditions | Click |
    | Privacy and Cookie Policy | Click |
    | Register My Account | Click |

    Then User should Register New Account Successfully