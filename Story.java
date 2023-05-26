package com.example.kingsguardian;

import android.media.MediaPlayer;
import android.sax.StartElementListener;

public class Story {
    GameScreen gs;

    String nextPosition1,nextPosition2;

    public Story(GameScreen gs){

        this.gs = gs;

    }

    public void selectPosition(String position){
        switch (position){

            case "pit": pit();break;
            case "startingPoint": startingPoint();break;
            case "death1": death1();break;
            case "death2": death2();break;
            case "guardian": guardian();break;
            case "doctor": doctor();break;
            case "help": help();break;
            case "back_to_castle": back_to_castle();break;
            case "sleep1": sleep1();break;
            case "morning1": morning1();break;
            case "talk1": talk1();break;
            case "talk12": talk12();break;
            case "talk13": talk13();break;
            case "gotomarket": gotomarket();break;
            case "seewhat": seewhat();break;
            case "seewhat1": seewhat1();break;
            case "seewhat2": seewhat2();break;
            case "seewhat3": seewhat3();break;
            case "seewhat4": seewhat4();break;
            case "seewhat5": seewhat5();break;
            case "backtocastle1": backtocastle1();break;
            case "gotolesson": gotolesson();break;
            case "lesson": lesson();break;
            case "lesson1": lesson1();break;
            case "lesson2": lesson2();break;
            case "lesson3": lesson3();break;
            case "lesson4": lesson4();break;
            case "bib1": bib1();break;
            case "learn": learn();break;
            case "curse": curse();break;
            case "room1_no_key": room1_no_key();break;
            case "rest_no_key":rest_no_key();break;
            case "rest_no_key1":rest_no_key1();break;
            case "rest_no_key2":rest_no_key2();break;
            case "rest_no_key3_sleep":rest_no_key3_sleep();break;
            case "rest_no_key3_sleep1":rest_no_key3_sleep1();break;
            case "rest_no_key3_sleep2":rest_no_key3_sleep2();break;
            case "rest_no_key3_sleep3":rest_no_key3_sleep3();break;
            case "rest_no_key3_sleep4":rest_no_key3_sleep4();break;
            case "rest_no_key3_sleep5":rest_no_key3_sleep5();break;
            case "come_closer":come_closer();break;
            case "yes":yes();break;
            case "marryme":marryme();break;
            case "marryme1":marryme1();break;
            case "marryme2":marryme2();break;
            case "run":run();break;
            case "run1":run1();break;
            case "run2":run2();break;
            case "death3":death3();break;
            case "have_key": have_key();break;
            case "bib2":bib2();break;
            case "nothing":nothing();break;
            case "inv1": inv1();break;
            case "inv": inv();break;
            case "bib3": bib3();break;
            case "bib4": bib4();break;
            case "bib5": bib5();break;
            case "bib6": bib6();break;
            case "bib7": bib7();break;
            case "ist": ist();break;
            case "forest": forest();break;
            case "forest2": forest2();break;
            case "yamalad": yamalad();break;
            case "yamanolad": yamanolad();break;
            case "yamaaaden": yamaaaden();break;
            case "yamaaanoch": yamaaanoch();break;
            case "sklad": sklad();break;
            case "sklad1": sklad1();break;
            case "komnata": komnata();break;
            case "komnata1": komnata1();break;
            case "why": why();break;
            case "why1": why1();break;
            case "ladder": ladder();break;
            case "inside_yama": inside_yama();break;
            case "ogon": ogon();break;
            case "finall": finall();break;
            case "back111": back111();break;
            case "back1111": back1111();break;
            case "les2den": les2den();break;
            case "lesnoch": lesnoch();break;
            case "lesden": lesden();break;
            case "have_ladder": have_ladder();break;
            case "burn_day": burn_day();break;
            case "burn_day1": burn_day1();break;
            case "burn_day2": burn_day2();break;
            case "burn_noch": burn_noch();break;
            case "burn_noch1": burn_noch1();break;
            case "burn_noch2": burn_noch2();
            case "burn_noch3": burn_noch3();break;

        }
    }
    public void startingPoint(){

        gs.image.setImageResource(R.drawable.forest);
        gs.text.setText("Вы находитесь в лесу. Ваша мать попросила собрать грибы для ужина. Уже стемнело, пора идти домой.");
        gs.button1.setText("Пойти по левой тропинке.");
        gs.button2.setText("Пойти по правой тропинке.");

        nextPosition1 = "guardian";
        nextPosition2 = "pit";
    }
    public void pit(){
        gs.image.setImageResource(R.drawable.yama);
        gs.text.setText("Перед вами огромная яма. Попробовать перейти её?");

        gs.button1.setText("Перейти яму.");
        gs.button2.setText("Вернуться назад.");

        nextPosition1 = "death1";
        nextPosition2 = "startingPoint";
    }

    public void guardian(){
        gs.image.setImageResource(R.drawable.guardian);
        gs.text.setText("Перед вами раненый королевский стражник. Он ослаб и истекает кровью. " +
                "Ваш взгляд привлекают богатые украшения на нем.");

        gs.button1.setText("Помочь ему.");
        gs.button2.setText("Ограбить его.");

        nextPosition1 = "help";
        nextPosition2 = "death2";
    }

    public void help(){
        gs.image.setImageResource(R.drawable.guardiansmile);
        gs.text.setText("Вы перевязяли его рану кусочком одежды. Его золотого цвета глаза смотрят на " +
                "вас с благодарностью.");

        gs.button1.setText("Позвать лекаря.");
        gs.button2.setText("Ограбить его.");

        nextPosition1 = "doctor";
        nextPosition2 = "death2";
    }
    public void doctor(){
        gs.image.setImageResource(R.drawable.forest);
        gs.text.setText("Вы вернулись в деревню за лекарем. Однако, когда вы привели его в лес, " +
                "стражника там уже не было.");
        gs.button1.setText("Пойти домой.");
        gs.button2.setText("");
        nextPosition1 = "back_to_castle";
        nextPosition2 = "";
    }
    public void death1(){
        gs.image.setImageResource(R.drawable.death);
        gs.text.setText("Вы провалились в яму и разбились.");

        gs.button1.setText("Начать заново.");
        gs.button2.setText("");
        nextPosition1 = "startingPoint";
        nextPosition2 = "";
    }

    public void death2(){
        gs.image.setImageResource(R.drawable.death);
        gs.text.setText("Стражник схватил вас за шею и вы медленно потеряли сознание. Вы погибли.");
        gs.button1.setText("Начать заново.");
        gs.button2.setText("");
        nextPosition1 = "startingPoint";
        nextPosition2 = "";
    }

    public void back_to_castle(){

        gs.image.setImageResource(R.drawable.koridor_day);
        gs.text.setText("Вы вернулись в замок. Ваша мать вас потеряла. Хоть вы и не выполнили поручение, " +
                "она рада, что вы в порядке.");

        gs.button1.setText("Лечь спать.");
        gs.button2.setText("");
        nextPosition1 = "sleep1";
        nextPosition2 = "";
    }

    public void sleep1(){
        gs.image.setImageResource(R.drawable.komnata_noch);
        gs.text.setText("Вы проснулись от необъяснимой тревоги. Этой ночью бушует гроза. Нужно спать " +
                "ведь завтра много дел.");

        gs.button1.setText("Спать дальше.");
        gs.button2.setText("");
        nextPosition1 = "morning1";
        nextPosition2 = "";
    }

    public void morning1(){
        gs.image.setImageResource(R.drawable.mama);
        gs.text.setText("Наступило утро. Ваша мать просит вас купить продукты на рынке.");

        gs.button1.setText("Спросить о слухах.");
        gs.button2.setText("Пойти на рынок.");
        nextPosition1 = "talk1";
        nextPosition2 = "gotomarket";
    }

    public void talk1(){
        gs.image.setImageResource(R.drawable.mama);
        gs.text.setText("Говорят, что один из новых королевских стражников учинил жестокую " +
                "расправу на площади.");

        gs.button1.setText("Почему?");
        gs.button2.setText("Пойти на рынок.");
        nextPosition1 = "talk12";
        nextPosition2 = "gotomarket";
    }

    public void talk12(){
        gs.image.setImageResource(R.drawable.mama);
        gs.text.setText("Ночью его не было на посту. Видимо, кутил в таверне. Наутро он показался " +
                "на площади в жутком виде.");
        gs.button1.setText("Что там произошло?");
        gs.button2.setText("Пойти на рынок.");
        nextPosition1 = "talk13";
        nextPosition2 = "gotomarket";
    }

    public void talk13(){
        gs.image.setImageResource(R.drawable.mama);
        gs.text.setText("Пьяница пошутил над его внешним видом и стражник убил его на месте.");
        gs.button1.setText("Пойти на рынок.");
        gs.button2.setText("");
        nextPosition1 = "gotomarket";
        nextPosition2 = "";
    }

    public void gotomarket(){
        gs.image.setImageResource(R.drawable.rynok);
        gs.text.setText("Вы выбираете продукты на рынке, но вас прерывает громкий плач женщины.");
        gs.button1.setText("Посмотреть, в чем дело.");
        gs.button2.setText("Вернуться в замок.");
        nextPosition1 = "seewhat";
        nextPosition2 = "backtocastle1";
    }

    public void seewhat(){
        gs.image.setImageResource(R.drawable.rynok);
        gs.text.setText("За что мне это?! Мой муж пьяница, но он не плохой человек! - кричит женщина.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "seewhat1";
        nextPosition2 = "";
    }

    public void seewhat1(){
        gs.image.setImageResource(R.drawable.rynok);
        gs.text.setText("На коленях у плачущей лежит окровавленный мужчина. Вокруг этой сцены " +
                "собралась толпа.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "seewhat2";
        nextPosition2 = "";
    }

    public void seewhat2(){
        gs.image.setImageResource(R.drawable.rynok);
        gs.text.setText("Этот стражник должен поплатиться за содеянное! - стонет женщина.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "seewhat3";
        nextPosition2 = "";
    }

    public void seewhat3(){
        gs.image.setImageResource(R.drawable.rynok);
        gs.text.setText("Ты ведь знаешь - это невозможно, - произносит кто-то из толпы, - королевские " +
                "стражники неприкосновенны.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "seewhat4";
        nextPosition2 = "";
    }

    public void seewhat4(){
        gs.image.setImageResource(R.drawable.rynok);
        gs.text.setText("Я видела его глаза! Это не человек, он проклят! - продолжала женщина.");
        gs.button1.setText("Послушать еще.");
        gs.button2.setText("Вернуться в замок.");
        nextPosition1 = "seewhat5";
        nextPosition2 = "backtocastle1";
    }

    public void seewhat5(){
        gs.image.setImageResource(R.drawable.rynok);
        gs.text.setText("Он проклят! У него глаза дьвола! - повторяет женщина.");
        gs.button1.setText("Вернуться в замок.");
        gs.button2.setText("");
        nextPosition1 = "backtocastle1";
        nextPosition2 = "";
    }

    public void backtocastle1(){
        gs.image.setImageResource(R.drawable.mama);
        gs.text.setText("Отлично. Я займусь готовкой, а ты поспеши на урок.");
        gs.button1.setText("Пойти на урок.");
        gs.button2.setText("");
        nextPosition1 = "gotolesson";
        nextPosition2 = "";
    }

    public void gotolesson(){
        gs.image.setImageResource(R.drawable.koridor_day);
        gs.text.setText("Ваш учитель был очень строг и высокомерен, он считал, что прислуга и их " +
                "дети не достойны чести учиться.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "lesson";
        nextPosition2 = "";
    }

    public void lesson(){
        gs.image.setImageResource(R.drawable.koridor_day);
        gs.text.setText("Поэтому даже при малейшем проступке он не упускал возможности отругать вас.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "lesson1";
        nextPosition2 = "";
    }

    public void lesson1(){
        gs.image.setImageResource(R.drawable.teacher);
        gs.text.setText("Никак не можешь запомнить время начала урока? - произнес он, когда вы вошли в класс.");
        gs.button1.setText("Извиниться за опоздание.");
        gs.button2.setText("");
        nextPosition1 = "lesson2";
        nextPosition2 = "";
    }

    public void lesson2(){
        gs.image.setImageResource(R.drawable.teacher);
        gs.text.setText("Садись - выдохнул он.");
        gs.button1.setText("Учиться.");
        gs.button2.setText("");
        nextPosition1 = "lesson3";
        nextPosition2 = "";
    }

    public void lesson3(){
        gs.image.setImageResource(R.drawable.claass);
        gs.text.setText("Урок прошел хорошо. Вы отвечали на вопросы учителя правильно. Казалось, "+
                "что он был доволен вами.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "lesson4";
        nextPosition2 = "";
    }

    public void lesson4(){
        gs.image.setImageResource(R.drawable.teacher);
        gs.text.setText("Урок подошел к концу.");

        gs.button1.setText("Попросить у учителя ключ от библиотеки.");
        gs.button2.setText("Вернуться в свою комнату.");

        nextPosition1 = "bib1";
        nextPosition2 = "room1_no_key";
    }

    public void bib1(){
        gs.image.setImageResource(R.drawable.teacher);
        gs.text.setText("Зачем он тебе? - удивился он.");

        gs.button1.setText("Я хочу учиться.");
        gs.button2.setText("Хочу узнать о проклятьях.");

        nextPosition1 = "learn";
        nextPosition2 = "curse";
    }

    public void learn(){
        gs.image.setImageResource(R.drawable.teacher);
        gs.text.setText("Это похвально, - учитель протянул вам ключ. Верни его вечером.");
        gs.button1.setText("Взять ключ.");
        gs.button2.setText("");
        nextPosition1 = "have_key";
        nextPosition2 = "";
    }

    public void have_key(){
        gs.image.setImageResource(R.drawable.koridor_day);
        gs.text.setText("Куда вы отправитесь?");
        gs.button1.setText("В комнату.");
        gs.button2.setText("В библиотеку.");
        nextPosition1 = "room1_no_key";
        nextPosition2 = "bib2";
    }

    public void bib2(){
        gs.image.setImageResource(R.drawable.door);
        gs.text.setText("Вы перед дверями библиотеки.");
        gs.button1.setText("Открыть инвентарь.");
        gs.button2.setText("Пойти в комнату.");
        nextPosition1 = "inv1";
        nextPosition2 = "room1_no_key";
    }

    public void inv1(){
        gs.image.setImageResource(R.drawable.inv_key);
        gs.text.setText("Инвентарь");
        gs.button1.setText("Ключ.");
        gs.button2.setText("Далее.");
        nextPosition1 = "bib3";
        nextPosition2 = "nothing";
    }

    public void nothing(){
        gs.image.setImageResource(R.drawable.inv_key);
        gs.text.setText("У вас больше ничего нет.");
        gs.button1.setText("Назад.");
        gs.button2.setText("");
        nextPosition1 = "inv1";
        nextPosition2 = "";
    }

    public void bib3(){
        gs.image.setImageResource(R.drawable.biblioteka);
        gs.text.setText("Вы вошли в библиотеку.");
        gs.button1.setText("Почитать книги о истории.");
        gs.button2.setText("Почитать книги о оккультизме.");
        nextPosition1 = "ist";
        nextPosition2 = "bib4";
    }

    public void ist(){
        gs.image.setImageResource(R.drawable.biblioteka);
        gs.text.setText("Вы полистали пару книг, но вам это быстро наскучило.");
        gs.button1.setText("Почитать книги о оккультизме.");
        gs.button2.setText("Пойти в комнату.");
        nextPosition1 = "bib4";
        nextPosition2 = "room1_no_key";
    }

    public void bib4(){
        gs.image.setImageResource(R.drawable.biblioteka);
        gs.text.setText("В одной из них загнутая страница.");
        gs.button1.setText("Прочитать страницу.");
        gs.button2.setText("");
        nextPosition1 = "bib5";
        nextPosition2 = "";
    }

    public void bib5(){
        gs.image.setImageResource(R.drawable.biblioteka);
        gs.text.setText("Здесь описывается как упокоить душу.");
        gs.button1.setText("Читать далее.");
        gs.button2.setText("");
        nextPosition1 = "bib6";
        nextPosition2 = "";
    }

    public void bib6(){
        gs.image.setImageResource(R.drawable.biblioteka);
        gs.text.setText("Ночью нужно закрыть умершему глаза и сжечь тело - вот лучший способ упокоить душу.");
        gs.button1.setText("Покинуть библиотеку.");
        gs.button2.setText("");
        nextPosition1 = "bib7";
        nextPosition2 = "";
    }

    public void bib7(){
        gs.image.setImageResource(R.drawable.koridor_day);
        gs.text.setText("Вам стало не по себе. Почему-то вас очень тянуло в лес, но одновременно эта мысль"+
                " была вам отвратительна.");
        gs.button1.setText("Пойти на склад.");
        gs.button2.setText("Пойти в лес.");
        nextPosition1 = "sklad";
        nextPosition2 = "forest";
    }
    public void forest(){
        gs.image.setImageResource(R.drawable.forest_day);
        gs.text.setText("Ноги будто сами завели вас в лес. Там где вы нашли стражника, конечно, было пусто.");
        gs.button1.setText("Пойти дальше.");
        gs.button2.setText("");
        nextPosition1 = "yamanolad";
        nextPosition2 = "";

    }

    public void forest2(){
        gs.image.setImageResource(R.drawable.forest_day);
        gs.text.setText("Ноги будто сами завели вас в лес. Там где вы нашли стражника, конечно, было пусто.");
        gs.button1.setText("Пойти дальше.");
        gs.button2.setText("");
        nextPosition1 = "yamalad";
        nextPosition2 = "";

    }

    public void yamalad(){
        gs.image.setImageResource(R.drawable.yama_day);
        gs.text.setText("Перед вами огромная яма. Что-то лежит на дне, но вы не можете разглядеть это.");
        gs.button1.setText("Открыть инвентарь.");
        gs.button2.setText("Прыгнуть.");
        nextPosition1 = "inv";
        nextPosition2 = "death1";

    }

    public void inv(){
        gs.image.setImageResource(R.drawable.inv_key_and_ladder);
        gs.text.setText("Инвентарь");
        gs.button1.setText("Лестница.");
        gs.button2.setText("Ключ.");
        nextPosition1 = "ladder";
        nextPosition2 = "why1";

    }

    public void why1(){
        gs.image.setImageResource(R.drawable.inv_key_and_ladder);
        gs.text.setText("Мне это не нужно.");
        gs.button1.setText("Назад.");
        gs.button2.setText("");
        nextPosition1 = "inv";
        nextPosition2 = "";

    }

    public void ladder(){
        gs.image.setImageResource(R.drawable.yama_day_with_ladder);
        gs.text.setText("Вы использовали лестницу.");
        gs.button1.setText("Спуститься.");
        gs.button2.setText("");
        nextPosition1 = "inside_yama";
        nextPosition2 = "";

    }

    public void inside_yama(){
        gs.image.setImageResource(R.drawable.guardiadead);
        gs.text.setText("Перед вами тело королевского стражника. Он умер давно. "+
                "Кто же тогда разгуливает по городу?");
        gs.button1.setText("Подняться.");
        gs.button2.setText("");
        nextPosition1 = "back111";
        nextPosition2 = "";

    }
    public void yamanolad(){
        gs.image.setImageResource(R.drawable.yama_day);
        gs.text.setText("Перед вами огромная яма. Что-то лежит на дне, но вы не можете разглядеть это.");
        gs.button1.setText("Вернуться в замок.");
        gs.button2.setText("Прыгнуть.");
        nextPosition1 = "back1111";
        nextPosition2 = "death1";

    }

    public void back111(){
        gs.image.setImageResource(R.drawable.koridor);
        gs.text.setText("Вы вернулись в замок.");
        gs.button1.setText("Пойти на склад.");
        gs.button2.setText("");
        nextPosition1 = "sklad1";
        nextPosition2 = "";

    }

    public void back1111(){
        gs.image.setImageResource(R.drawable.koridor_day);
        gs.text.setText("Вы вернулись в замок.");
        gs.button1.setText("Пойти на склад.");
        gs.button2.setText("");
        nextPosition1 = "sklad";
        nextPosition2 = "";

    }

    public void sklad1(){
        gs.image.setImageResource(R.drawable.storage_withogonl);
        gs.text.setText("Вы пришли на склад.");
        gs.button1.setText("Взять огниво.");
        gs.button2.setText("");
        nextPosition1 = "ogon";
        nextPosition2 = "";
    }

    public void ogon(){
        gs.image.setImageResource(R.drawable.storage);
        gs.text.setText("Куда отправиться?");
        gs.button1.setText("В лес.");
        gs.button2.setText("В комнату.");
        nextPosition1 = "les2den";
        nextPosition2 = "komnata";

    }
    public void les2den(){
        gs.image.setImageResource(R.drawable.koridor_day);
        gs.text.setText("Вы уверены? Сейчас день.");
        gs.button1.setText("Да.");
        gs.button2.setText("Пойти в комнату.");
        nextPosition1 = "lesden";
        nextPosition2 = "komnata";
    }
    public void komnata(){
        gs.image.setImageResource(R.drawable.komnata);
        gs.text.setText("Вы в команте.");
        gs.button1.setText("Подождать до ночи.");
        gs.button2.setText("Покинуть комнату.");
        nextPosition1 = "komnata1";
        nextPosition2 = "ogon";
    }

    public void komnata1(){
        gs.image.setImageResource(R.drawable.komnata_noch);
        gs.text.setText("Наступила ночь. Вы чувствуете усталось, но что-то словно тянет вас в лес.");
        gs.button1.setText("Пойти в лес.");
        gs.button2.setText("");
        nextPosition1 = "lesnoch";
        nextPosition2 = "";
    }

    public void lesnoch(){
        gs.image.setImageResource(R.drawable.forest);
        gs.text.setText("Вы в лесу.");
        gs.button1.setText("Подойти к яме.");
        gs.button2.setText("");
        nextPosition1 = "yamaaanoch";
        nextPosition2 = "";
    }

    public void yamaaanoch(){
        gs.image.setImageResource(R.drawable.yama_ladder);
        gs.text.setText("Перед вами огромная яма.");
        gs.button1.setText("Спуститься.");
        gs.button2.setText("Прыгнуть.");
        nextPosition1 = "burn_noch";
        nextPosition2 = "death1";

    }
    public void burn_noch(){
        gs.image.setImageResource(R.drawable.guardiadead);
        gs.text.setText("Перед вами тело королевского стражника.");
        gs.button1.setText("Сжечь тело.");
        gs.button2.setText("");
        nextPosition1 = "burn_noch1";
        nextPosition2 = "";
    }

    public void burn_noch1(){
        gs.image.setImageResource(R.drawable.guardianfire);
        gs.text.setText("Вы закрываете стражнику глаза и поджигаете тело.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "burn_noch2";
        nextPosition2 = "";
    }

    public void burn_noch2(){
        gs.image.setImageResource(R.drawable.guardianfire);
        gs.text.setText("Вы чувствуете, что теперь все будет хорошо.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "burn_noch3";
        nextPosition2 = "";
    }

    public void burn_noch3(){
        gs.image.setImageResource(R.drawable.guardianfire);
        gs.text.setText("Наблюдая за огнем, вы слышите тихий шепот. Спасибо, дитя, - мужской голос раздается "+
                "будто у вас в голове.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "finall";
        nextPosition2 = "";
    }
    public void finall(){
        gs.image.setImageResource(R.drawable.forest_day);
        gs.text.setText("Поздравляем! Вы спасли королевство!");
        gs.button1.setText("Начать заново.");
        gs.button2.setText("");
        nextPosition1 = "startingPoint";
        nextPosition2 = "";
    }

    public void lesden(){
        gs.image.setImageResource(R.drawable.forest_day);
        gs.text.setText("Вы в лесу.");
        gs.button1.setText("Подойти к яме.");
        gs.button2.setText("");
        nextPosition1 = "yamaaaden";
        nextPosition2 = "";
    }

    public void yamaaaden(){
        gs.image.setImageResource(R.drawable.yama_day_with_ladder);
        gs.text.setText("Перед вами огромная яма.");
        gs.button1.setText("Спуститься.");
        gs.button2.setText("Прыгнуть.");
        nextPosition1 = "burn_day";
        nextPosition2 = "death1";

    }

    public void burn_day(){
        gs.image.setImageResource(R.drawable.guardiadead);
        gs.text.setText("Перед вами тело королевского стражника.");
        gs.button1.setText("Сжечь тело.");
        gs.button2.setText("");
        nextPosition1 = "burn_day1";
        nextPosition2 = "";
    }

    public void burn_day1(){
        gs.image.setImageResource(R.drawable.guardianfire);
        gs.text.setText("Кажется, все теперь позади.");
        gs.button1.setText("Подняться.");
        gs.button2.setText("");
        nextPosition1 = "burn_day2";
        nextPosition2 = "";
    }

    public void burn_day2(){
        gs.image.setImageResource(R.drawable.guardianext);
        gs.text.setText("Жалкая попытка, человеческое дитя.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "death3";
        nextPosition2 = "";
    }

    public void sklad(){
        gs.image.setImageResource(R.drawable.storage_with_all);
        gs.text.setText("Вы пришли на склад.");
        gs.button1.setText("Взять лестницу.");
        gs.button2.setText("Взять огниво.");
        nextPosition1 = "have_ladder";
        nextPosition2 = "why";

    }

    public void why(){
        gs.image.setImageResource(R.drawable.storage_with_all);
        gs.text.setText("Я не понимаю, зачем это мне.");
        gs.button1.setText("Взять лестницу.");
        gs.button2.setText("Пойти в комнату.");
        nextPosition1 = "have_ladder";
        nextPosition2 = "room1_no_key";

    }

    public void have_ladder(){
        gs.image.setImageResource(R.drawable.storage_withogonl);
        gs.text.setText("Вы взяли лестницу.");
        gs.button1.setText("Пойти в лес.");
        gs.button2.setText("");
        nextPosition1 = "forest2";
        nextPosition2 = "";
    }
    public void curse(){
        gs.image.setImageResource(R.drawable.koridor_day);
        gs.text.setText("Отвратительно! Я не позволю тебе заниматься таким, - учитель выгнал вас из " +
                "класса и захлопнул дверь.");
        gs.button1.setText("Пойти в свою комнату.");
        gs.button2.setText("");
        nextPosition1 = "room1_no_key";
        nextPosition2 = "";
    }

    public void room1_no_key(){
        gs.image.setImageResource(R.drawable.komnata);
        gs.text.setText("В комнате было пусто. Внезапно вы чувствуете сильную усталость.");

        gs.button1.setText("Прилечь отдохнуть.");
        gs.button2.setText("");

        nextPosition1 = "rest_no_key";
        nextPosition2 = "";
    }

    public void rest_no_key(){
        gs.image.setImageResource(R.drawable.komnata);
        gs.text.setText("Вы проснулись от скрипа двери. Вот ты где! - вскликнула ваша мать. " +
                "Я боялась за тебя.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "rest_no_key1";
        nextPosition2 = "";
    }

    public void rest_no_key1(){
        gs.image.setImageResource(R.drawable.mama);
        gs.text.setText("Хорошо, что мы в замке. Надеюсь, остальные стражники поставят его на место, " +
                "- продолжила она.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "rest_no_key2";
        nextPosition2 = "";
    }

    public void rest_no_key2(){
        gs.image.setImageResource(R.drawable.mama);
        gs.text.setText("А ты иди и поработай. Негоже посреди дня в постели отлеживаться.");
        gs.button1.setText("Я хочу спать.");
        gs.button2.setText("");
        nextPosition1 = "rest_no_key3_sleep";
        nextPosition2 = "";
    }

    public void rest_no_key3_sleep(){
        gs.image.setImageResource(R.drawable.mama);
        gs.text.setText("Что же, тогда спи. Возможно тебе и правда стоит отдохнуть.");
        gs.button1.setText("Спать дальше.");
        gs.button2.setText("");
        nextPosition1 = "rest_no_key3_sleep1";
        nextPosition2 = "";
    }

    public void rest_no_key3_sleep1(){
        gs.image.setImageResource(R.drawable.komnata);
        gs.text.setText("Вас клонило в сон. Казалось будто ваше сознание затуманено.");
        gs.button1.setText("Спать дальше.");
        gs.button2.setText("");
        nextPosition1 = "rest_no_key3_sleep2";
        nextPosition2 = "";
    }

    public void rest_no_key3_sleep2(){
        gs.image.setImageResource(R.drawable.komnata_noch);
        gs.text.setText("Вы проспали до глубокой ночи. Проснувшись вы услышали раскаты грома за окном. "+
                "В комнате никого не было.");
        gs.button1.setText("Выйти из комнаты.");
        gs.button2.setText("");
        nextPosition1 = "rest_no_key3_sleep3";
        nextPosition2 = "";
    }

    public void rest_no_key3_sleep3(){
        gs.image.setImageResource(R.drawable.koridor);
        gs.text.setText("В замке было тихо, вы чувствовали беспокойство.");
        gs.button1.setText("Пройти по коридору.");
        gs.button2.setText("");
        nextPosition1 = "rest_no_key3_sleep4";
        nextPosition2 = "";
    }

    public void rest_no_key3_sleep4(){
        gs.image.setImageResource(R.drawable.koridor_withblood);
        gs.text.setText("Вы видите следы крови на стенах.");
        gs.button1.setText("Пройти по коридору.");
        gs.button2.setText("");
        nextPosition1 = "rest_no_key3_sleep5";
        nextPosition2 = "";
    }

    public void rest_no_key3_sleep5(){
        gs.image.setImageResource(R.drawable.guardianshadow);
        gs.text.setText("Вы видите перед собой темный силуэт.");
        gs.button1.setText("Подойти ближе.");
        gs.button2.setText("Бежать.");
        nextPosition1 = "come_closer";
        nextPosition2 = "run";
    }

    public void come_closer(){
        gs.image.setImageResource(R.drawable.guardianext);
        gs.text.setText("Вот так, дитя. Ты хочешь обрести силу? - он наклонился к вам. Вы узнали его. "+
                "Это стражник, которого вы спасли.");
        gs.button1.setText("Да.");
        gs.button2.setText("Нет.");
        nextPosition1 = "yes";
        nextPosition2 = "death3";
    }

    public void yes(){
        gs.image.setImageResource(R.drawable.guardianext);
        gs.text.setText("Я знал, что ты особенная, - улыбнулся он. Пойдем со мной и мы будем царствовать"+
                " в этом мире.");
        gs.button1.setText("Пойти с ним.");
        gs.button2.setText("Нет.");
        nextPosition1 = "marryme";
        nextPosition2 = "death3";
    }

    public void marryme(){
        gs.image.setImageResource(R.drawable.koridor_withblood);
        gs.text.setText("Вы следовали за ним проходя мимо окровавленных тел людей которые были частью"+
                " вашей жизни. На ступенях замка лицом вниз лежал ваш учитель.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "marryme1";
        nextPosition2 = "";
    }

    public void marryme1(){
        gs.image.setImageResource(R.drawable.koridor_withblood);
        gs.text.setText("Вы знали, что с вашей матерью служилось то же, что со всеми этими людьми.");
        gs.button1.setText("Идти дальше.");
        gs.button2.setText("");
        nextPosition1 = "marryme2";
        nextPosition2 = "";
    }

    public void marryme2(){
        gs.image.setImageResource(R.drawable.forest);
        gs.text.setText("Вы покинули замок вместе со стражником. На улице лежали сотни тел. Его глаза горели в ночи, он самодовольно"+
                " улыбнулся, глядя на вас.");
        gs.button1.setText("Начать заново.");
        gs.button2.setText("");
        nextPosition1 = "startingPoint";
        nextPosition2 = "";
    }


    public void run(){
        gs.image.setImageResource(R.drawable.koridor_withblood);
        gs.text.setText("Вы разворачиваетесь, но кто-то хватает вас сзади и швыряет о стену.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "run1";
        nextPosition2 = "";
    }

    public void run1(){
        gs.image.setImageResource(R.drawable.guardianext);
        gs.text.setText("Глупое человеческое дитя, - вы смутно можете разглядеть лицо стражника."+
                " Его вы спасли прошлой ночью.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "run2";
        nextPosition2 = "";
    }

    public void run2(){
        gs.image.setImageResource(R.drawable.guardianext);
        gs.text.setText("Я бы мог дать тебе силу, - прошептал он, - не мучайся.");
        gs.button1.setText("Далее.");
        gs.button2.setText("");
        nextPosition1 = "death3";
        nextPosition2 = "";
    }
    public void death3(){
        gs.image.setImageResource(R.drawable.death);
        gs.text.setText("Он поднес лезвие меча к вашему горлу. Вы погибли.");
        gs.button1.setText("Начать заново.");
        gs.button2.setText("");
        nextPosition1 = "startingPoint";
        nextPosition2 = "";
    }
}
