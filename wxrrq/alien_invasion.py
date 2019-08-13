import pygame
from settings import Settings
from ship import Ship
import game_functions as gf
from pygame.sprite import Group
from alien import Alien
from game_states import GameStates
from button import Button
from scoreboard import  Scoreboard

def run_game():
    pygame.init()
    FPS = 30  # frames per second setting
    fpsClock = pygame.time.Clock()
    ai_settings = Settings()
    screen = pygame.display.set_mode(
        (ai_settings.screen_width, ai_settings.screen_heigth)
    )
    pygame.display.set_caption("Alien Invasion")
    play_button = Button(ai_settings, screen,"PLAY")
    ship = Ship(ai_settings, screen)
    bullets = Group()
    aliens = Group()
    gf.create_fleet(ai_settings, screen, ship, aliens)
    stats = GameStates(ai_settings)
    sb = Scoreboard(ai_settings, screen , stats)


    while True:
        gf.check_events(ai_settings,screen,stats,sb, play_button,ship ,aliens,bullets)
        if stats.game_active:
            ship.update()
            gf.update_bullets(ai_settings, screen, stats,sb , ship,aliens, bullets)
            gf.update_aliens(ai_settings,stats,screen,sb, ship, aliens,bullets)
        gf.update_screen(ai_settings, screen,stats,sb, ship, aliens, bullets,play_button)
        pygame.display.update()
        fpsClock.tick(FPS)

run_game()


