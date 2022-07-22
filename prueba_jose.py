#driver.get('https://utest.com')

from faulthandler import is_enabled
from time import sleep
import unittest
from selenium import webdriver
"""
Creación de un usuario dentro de la página
"""
class RegisterNewUser(unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Chrome(executable_path=r'E:\descargas\chromedriver.exe')
        driver = self.driver
        driver.implicitly_wait(50)
        driver.maximize_window()
        driver.get('https://utest.com')
        sleep(2)

    def test_new_user(self):
        driver = self.driver
        driver.find_element_by_xpath('/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[5]/ul/li[6]/a')
        driver.find_element_by_link_text('Join Today').click()
        sleep(3)
        """
        Vamos a verificar si estamos en la parte de creación de cuenta, y eso lo podemos saber con el título que tiene la pestaña
        assertEqual -> porque vamos a comparar una igualdad de que si el sitio tiene como nombre: uTest - User SignUp
        """
        self.assertEqual('uTest - User SignUp', driver.title)
        sleep(2)

        first_name = driver.find_element_by_id('firstName')
        last_name = driver.find_element_by_id('lastName')
        email_address = driver.find_element_by_name('email')
        month_birth_day = driver.find_element_by_id('birthMonth')
        day_birth_day = driver.find_element_by_css_selector('#birthDay')
        year_birth_day = driver.find_element_by_xpath('/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select')
        button_next = driver.find_element_by_xpath('/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a/span')

        #Vamos a verificar que esos campos estén habilitados con un assertions y lo hacemos de la siguiente manera

        self.assertTrue(first_name.is_enabled()
        and last_name.is_enabled()
        and email_address.is_enabled()
        and month_birth_day.is_enabled()
        and day_birth_day.is_enabled()
        and year_birth_day.is_enabled()
        and button_next.is_enabled()

        )
        
        # Vamos a enviar los datos a cada uno de los campos y usamos el método send_keys(value)
        first_name.send_keys('Test Jose')
        sleep(2)
        last_name.send_keys('Test Dev')
        sleep(2)
        email_address.send_keys('Testdev@gmail.com')
        sleep(2)
        month_birth_day.send_keys('December')
        sleep(2)
        day_birth_day.send_keys(30)
        sleep(2)
        year_birth_day.send_keys(1995)
        sleep(2)
        button_next.click()
        sleep(3)
    
    def tearDown(self):
        self.driver.implicitly_wait(3)
        self.driver.close()

if __name__ == '__main__':
    unittest.main(verbosity=2)

