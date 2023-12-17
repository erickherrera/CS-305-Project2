# CS-305-Project2
Secure server application using SSL

  - Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?
      - Artemis Financial approached me with a mandate to enhance the security of their customer data. Recognizing the paramount significance of cybersecurity for both the company and its clientele, there was a pressing need to fortify the existing system infrastructure. This entailed implementing robust measures such as algorithm ciphers, SSL certificates, and ensuring the currency of API dependencies to establish a resilient foundation for their operations.

  - What did you do particularly well in identifying their software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?
    - Through the application of penetration testing, I systematically identified and cataloged all vulnerabilities present within the provided code base. This comprehensive assessment enabled me to create a detailed inventory of the security challenges confronting the system. Armed with this insight, I was equipped to devise optimal solutions for fortifying the code and enhancing overall security.

  - What about the process of working through the vulnerability assessment did you find challenging or helpful?
    - The experience proved invaluable as it afforded me a broader perspective on the necessary tasks at hand. Nonetheless, the initial phase was marked by considerable challenges in acclimating to the intricacies of the system's operations. Discerning the parameters for scanning, especially when addressing vulnerabilities in the dependencies, posed a notable challenge. During this period, StackOverflow served as an indispensable resource, providing crucial insights and support throughout the process.
  
  - How did you approach the need to increase layers of security? What techniques or strategies would you use in the future to assess vulnerabilities and determine mitigation techniques?
    - To ensure optimal security, the implementation of layered security is imperative. This approach involves deploying a combination of multiple security controls strategically to safeguard vulnerable facets of both the software and the overarching system. By incorporating diverse protective measures, this methodology enhances the overall security posture, cultivating a secure environment. Among the techniques utilized, multi-factor authentication stands out as an effective means to fortify access controls and mitigate potential threats.

  - How did you ensure the code and software application were functional and secure? After refactoring code, how did you check to see whether you introduced new vulnerabilities?
    - Throughout the development process, code scanning tools were employed to detect vulnerabilities inherent to the programming language in use. In order to guarantee the functionality and security of the final application, a proactive approach was adopted, involving continuous updates of code packages at various stages of development. This departure from the conventional practice of waiting until the final phase for scans ensured a more robust and resilient codebase.
    - In terms of refactoring, a systematic approach was adhered to, entailing preemptive refactoring prior to the introduction of new features. This method was accompanied by the establishment of clear timelines to mitigate the risks associated with last-minute rushes. Rigorous testing procedures were seamlessly integrated into the refactoring process, ensuring that the codebase maintained high standards of functionality and security throughout its evolution.
  
  - What resources, tools, or coding practices did you employ that you might find helpful in future assignments or tasks?
    - I used Stackoverflow, and learning the ins and outs of Eclipse helped a ton when it came to debugging errors related to Maven or Keytool plugin. I also referenced the course book, Iron-Clad Java by Jim Manico, August Detlefsen, when it came to understanding possible vulnerabilities and industry best practices.


  - Employers sometimes ask for examples of work that you have successfully completed to demonstrate your skills, knowledge, and experience. What from this particular assignment might you want to showcase to a future employer?
    - I would present this project as a demonstrative showcase of my capabilities. The successful completion of all specified requirements attests to the effective utilization of available tools and resources. This project not only met the outlined criteria but also exemplified a proficient use of the tools at my disposal. Importantly, it has served as a catalyst in instilling the confidence necessary to conduct comprehensive security tests on code, ensuring its robustness and resilience against potential vulnerabilities.
