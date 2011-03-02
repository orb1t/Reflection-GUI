package reflectiongui.controllers;

/**
 * Объекты, реализующие этот интерфейс, позволяют обновлять параметры (например заголовок)
 * у окон, содержащих renderer объекта.
 * <p/>
 * ObjectFrameUpdater должен хранить ссылку на управляемый им объект,
 * поэтому при вызове его методов управляемый объект указывать не требуется.
 */
public interface ObjectFrameUpdater {
    /** Обновить окно управляемого объекта, запросив параметры у его контроллера. */
    void updateFrame();
}
